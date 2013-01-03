
package com.ecocoma.service.shipping.ups;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Shipping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Shipping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Package" type="{http://service.ecocoma.com/shipping/ups}ArrayOfPostage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Shipping", propOrder = {
    "_package"
})
public class Shipping {

    @XmlElement(name = "Package")
    protected ArrayOfPostage _package;

    /**
     * Gets the value of the package property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPostage }
     *     
     */
    public ArrayOfPostage getPackage() {
        return _package;
    }

    /**
     * Sets the value of the package property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPostage }
     *     
     */
    public void setPackage(ArrayOfPostage value) {
        this._package = value;
    }

}
