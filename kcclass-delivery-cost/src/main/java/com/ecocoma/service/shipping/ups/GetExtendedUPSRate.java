
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
 *         &lt;element name="KeyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DomainID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="origPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="origCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Options" type="{http://service.ecocoma.com/shipping/ups}Options" minOccurs="0"/>
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
    "keyID",
    "domainID",
    "origPostal",
    "origCountry",
    "destPostal",
    "destCountry",
    "weight",
    "value",
    "options"
})
@XmlRootElement(name = "GetExtendedUPSRate")
public class GetExtendedUPSRate {

    @XmlElement(name = "KeyID")
    protected String keyID;
    @XmlElement(name = "DomainID")
    protected String domainID;
    protected String origPostal;
    protected String origCountry;
    protected String destPostal;
    protected String destCountry;
    @XmlElement(name = "Weight")
    protected String weight;
    @XmlElement(name = "Value")
    protected String value;
    @XmlElement(name = "Options")
    protected Options options;

    /**
     * Gets the value of the keyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyID() {
        return keyID;
    }

    /**
     * Sets the value of the keyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyID(String value) {
        this.keyID = value;
    }

    /**
     * Gets the value of the domainID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainID() {
        return domainID;
    }

    /**
     * Sets the value of the domainID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainID(String value) {
        this.domainID = value;
    }

    /**
     * Gets the value of the origPostal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigPostal() {
        return origPostal;
    }

    /**
     * Sets the value of the origPostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigPostal(String value) {
        this.origPostal = value;
    }

    /**
     * Gets the value of the origCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigCountry() {
        return origCountry;
    }

    /**
     * Sets the value of the origCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigCountry(String value) {
        this.origCountry = value;
    }

    /**
     * Gets the value of the destPostal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestPostal() {
        return destPostal;
    }

    /**
     * Sets the value of the destPostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestPostal(String value) {
        this.destPostal = value;
    }

    /**
     * Gets the value of the destCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestCountry() {
        return destCountry;
    }

    /**
     * Sets the value of the destCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestCountry(String value) {
        this.destCountry = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeight(String value) {
        this.weight = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link Options }
     *     
     */
    public Options getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link Options }
     *     
     */
    public void setOptions(Options value) {
        this.options = value;
    }

}
