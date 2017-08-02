
package de.webpdf.sample.schema.operation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.webpdf.de/1.0/operation}MarginType"&gt;
 *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" default="210" /&gt;
 *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" default="297" /&gt;
 *       &lt;attribute name="metrics" default="mm"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://schema.webpdf.de/1.0/operation}MetricsType"&gt;
 *             &lt;enumeration value="mm"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PageType")
public class PageType
    extends MarginType
{

    @XmlAttribute(name = "width")
    protected Integer width;
    @XmlAttribute(name = "height")
    protected Integer height;
    @XmlAttribute(name = "metrics")
    protected MetricsType metrics;

    /**
     * Ruft den Wert der width-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getWidth() {
        if (width == null) {
            return  210;
        } else {
            return width;
        }
    }

    /**
     * Legt den Wert der width-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWidth(Integer value) {
        this.width = value;
    }

    /**
     * Ruft den Wert der height-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getHeight() {
        if (height == null) {
            return  297;
        } else {
            return height;
        }
    }

    /**
     * Legt den Wert der height-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHeight(Integer value) {
        this.height = value;
    }

    /**
     * Ruft den Wert der metrics-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MetricsType }
     *     
     */
    public MetricsType getMetrics() {
        if (metrics == null) {
            return MetricsType.MM;
        } else {
            return metrics;
        }
    }

    /**
     * Legt den Wert der metrics-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MetricsType }
     *     
     */
    public void setMetrics(MetricsType value) {
        this.metrics = value;
    }

}
