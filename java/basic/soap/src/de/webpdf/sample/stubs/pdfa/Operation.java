
package de.webpdf.sample.stubs.pdfa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billing" type="{http://schema.webpdf.de/1.0/operation}BillingType" minOccurs="0"/>
 *         &lt;element name="password" type="{http://schema.webpdf.de/1.0/operation}PdfPasswordType" minOccurs="0"/>
 *         &lt;element name="pdfa" type="{http://schema.webpdf.de/1.0/operation}PdfaType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "billing",
    "password",
    "pdfa"
})
@XmlRootElement(name = "operation")
public class Operation {

    protected BillingType billing;
    protected PdfPasswordType password;
    @XmlElement(required = true)
    protected PdfaType pdfa;

    /**
     * Gets the value of the billing property.
     * 
     * @return
     *     possible object is
     *     {@link BillingType }
     *     
     */
    public BillingType getBilling() {
        return billing;
    }

    /**
     * Sets the value of the billing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingType }
     *     
     */
    public void setBilling(BillingType value) {
        this.billing = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link PdfPasswordType }
     *     
     */
    public PdfPasswordType getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link PdfPasswordType }
     *     
     */
    public void setPassword(PdfPasswordType value) {
        this.password = value;
    }

    /**
     * Gets the value of the pdfa property.
     * 
     * @return
     *     possible object is
     *     {@link PdfaType }
     *     
     */
    public PdfaType getPdfa() {
        return pdfa;
    }

    /**
     * Sets the value of the pdfa property.
     * 
     * @param value
     *     allowed object is
     *     {@link PdfaType }
     *     
     */
    public void setPdfa(PdfaType value) {
        this.pdfa = value;
    }

}
