
package de.webpdf.sample.stubs.signature;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CertificationLevelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CertificationLevelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="noChanges"/>
 *     &lt;enumeration value="formFillingAndSignatures"/>
 *     &lt;enumeration value="formFillingAndSignaturesAndAnnotations"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CertificationLevelType")
@XmlEnum
public enum CertificationLevelType {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("noChanges")
    NO_CHANGES("noChanges"),
    @XmlEnumValue("formFillingAndSignatures")
    FORM_FILLING_AND_SIGNATURES("formFillingAndSignatures"),
    @XmlEnumValue("formFillingAndSignaturesAndAnnotations")
    FORM_FILLING_AND_SIGNATURES_AND_ANNOTATIONS("formFillingAndSignaturesAndAnnotations");
    private final String value;

    CertificationLevelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CertificationLevelType fromValue(String v) {
        for (CertificationLevelType c: CertificationLevelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
