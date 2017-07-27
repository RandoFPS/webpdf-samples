
package de.webpdf.sample.stubs.ocr;

import javax.activation.DataHandler;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.webpdf.sample.stubs.ocr package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _WebserviceException_QNAME = new QName("http://schema.webpdf.de/1.0/soap/ocr", "WebserviceException");
    private final static QName _Execute_QNAME = new QName("http://schema.webpdf.de/1.0/soap/ocr", "execute");
    private final static QName _ExecuteResponse_QNAME = new QName("http://schema.webpdf.de/1.0/soap/ocr", "executeResponse");
    private final static QName _ExecuteResponseReturn_QNAME = new QName("", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.webpdf.sample.stubs.ocr
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FaultInfo }
     * 
     */
    public FaultInfo createFaultInfo() {
        return new FaultInfo();
    }

    /**
     * Create an instance of {@link Execute }
     * 
     */
    public Execute createExecute() {
        return new Execute();
    }

    /**
     * Create an instance of {@link ExecuteResponse }
     * 
     */
    public ExecuteResponse createExecuteResponse() {
        return new ExecuteResponse();
    }

    /**
     * Create an instance of {@link Operation }
     * 
     */
    public Operation createOperation() {
        return new Operation();
    }

    /**
     * Create an instance of {@link BillingType }
     * 
     */
    public BillingType createBillingType() {
        return new BillingType();
    }

    /**
     * Create an instance of {@link PdfPasswordType }
     * 
     */
    public PdfPasswordType createPdfPasswordType() {
        return new PdfPasswordType();
    }

    /**
     * Create an instance of {@link OcrType }
     * 
     */
    public OcrType createOcrType() {
        return new OcrType();
    }

    /**
     * Create an instance of {@link OcrPageType }
     * 
     */
    public OcrPageType createOcrPageType() {
        return new OcrPageType();
    }

    /**
     * Create an instance of {@link Base64Binary }
     * 
     */
    public Base64Binary createBase64Binary() {
        return new Base64Binary();
    }

    /**
     * Create an instance of {@link HexBinary }
     * 
     */
    public HexBinary createHexBinary() {
        return new HexBinary();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.webpdf.de/1.0/soap/ocr", name = "WebserviceException")
    public JAXBElement<FaultInfo> createWebserviceException(FaultInfo value) {
        return new JAXBElement<FaultInfo>(_WebserviceException_QNAME, FaultInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Execute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.webpdf.de/1.0/soap/ocr", name = "execute")
    public JAXBElement<Execute> createExecute(Execute value) {
        return new JAXBElement<Execute>(_Execute_QNAME, Execute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.webpdf.de/1.0/soap/ocr", name = "executeResponse")
    public JAXBElement<ExecuteResponse> createExecuteResponse(ExecuteResponse value) {
        return new JAXBElement<ExecuteResponse>(_ExecuteResponse_QNAME, ExecuteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataHandler }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = ExecuteResponse.class)
    @XmlMimeType("application/octet-stream")
    public JAXBElement<DataHandler> createExecuteResponseReturn(DataHandler value) {
        return new JAXBElement<DataHandler>(_ExecuteResponseReturn_QNAME, DataHandler.class, ExecuteResponse.class, value);
    }

}
