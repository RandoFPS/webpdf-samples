<?php

$inputFile = '../../files/lorem-ipsum.pdf';
$inputFileURL = "file://".realpath($inputFile);
$resultFile = '../../result/output-soap.pdf';
$resultFileURL = '../../result/output-url-soap.pdf';

if (!file_exists($inputFile)) {
    echo "Input file '".$inputFile."' does not exist";
    exit;
}

// creating soap client for pdfa service
try {
    $client = new SoapClient(
        "http://localhost:8080/webPDF/soap/pdfa?wsdl", [
            'soap_version' => SOAP_1_2,
            'exceptions' => true,
            'trace' => true,
            'connection_timeout' => 5,
            'cache_wsdl' => WSDL_CACHE_NONE,
            'cache_ttl' => 24 * 60 * 60,
            'login' => "admin",
            'password' => "admin",

        ]
    );
} catch (Exception $e) {
    echo $e;
    exit;
}

$operationParameters = [
    'pdfa' => [
        'convert' => [
            'level' => '3b',
            'errorReport' => 'message',
            'imageQuality' => '90',
        ],
    ],
    'billing' => [
        'userName' => 'John Doe',
        'applicationName' => 'webPDF Sample Application',
        'customerCode' => 'ABC123',
    ],
];

// converting local file with pdfa service
try {
    echo("Using web service 'pdfa' with local file '".$inputFile."'\n");
    $parameters = [
        'operation' => $operationParameters,
        'fileContent' => file_get_contents($inputFile),
    ];

    $response = $client->execute($parameters);
    file_put_contents($resultFile, $response->return);
    echo "Output file '".$resultFile."' created\n";

} catch (Exception $e) {
    if ($e->detail) {
        echo "Error code: {$e->detail->WebserviceException->errorCode}\n";
        echo "Error message: {$e->detail->WebserviceException->errorMessage}\n";
    }
    echo "$e\n";
}

echo "----------\n";

// converting URL resource with pdfa service
try {
    echo("Using web service 'converter' with file URL '".$inputFileURL."'\n");

    $parameters = [
        'operation' => $operationParameters,
        "fileURL" => $inputFileURL,
    ];

    $response = $client->execute($parameters);
    file_put_contents($resultFileURL, $response->return);
    echo "Output file $resultFileURL created\n";

} catch (SoapFault $e) {
    if ($e->detail) {
        echo "Error code: {$e->detail->WebserviceException->errorCode}\n";
        echo "Error message: {$e->detail->WebserviceException->errorMessage}\n\n";
    }
    echo "$e\n";
}
