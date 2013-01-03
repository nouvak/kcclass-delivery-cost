
package com.ecocoma.service.shipping.ups;

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
 *         &lt;element name="GetUPSRateResult" type="{http://service.ecocoma.com/shipping/ups}Shipping" minOccurs="0"/>
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
    "getUPSRateResult"
})
@XmlRootElement(name = "GetUPSRateResponse")
public class GetUPSRateResponse {

    @XmlElement(name = "GetUPSRateResult")
    protected Shipping getUPSRateResult;

    /**
     * Gets the value of the getUPSRateResult property.
     * 
     * @return
     *     possible object is
     *     {@link Shipping }
     *     
     */
    public Shipping getGetUPSRateResult() {
        return getUPSRateResult;
    }

    /**
     * Sets the value of the getUPSRateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Shipping }
     *     
     */
    public void setGetUPSRateResult(Shipping value) {
        this.getUPSRateResult = value;
    }

}
