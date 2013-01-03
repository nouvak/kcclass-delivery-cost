/**
 * DeliveryOnInvoiceAcceptanceDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.rate.stub;

public class DeliveryOnInvoiceAcceptanceDetail  implements java.io.Serializable {
    private com.fedex.rate.stub.Party recipient;

    /* Specifies the tracking id for the return, if preassigned. */
    private com.fedex.rate.stub.TrackingId trackingId;

    public DeliveryOnInvoiceAcceptanceDetail() {
    }

    public DeliveryOnInvoiceAcceptanceDetail(
           com.fedex.rate.stub.Party recipient,
           com.fedex.rate.stub.TrackingId trackingId) {
           this.recipient = recipient;
           this.trackingId = trackingId;
    }


    /**
     * Gets the recipient value for this DeliveryOnInvoiceAcceptanceDetail.
     * 
     * @return recipient
     */
    public com.fedex.rate.stub.Party getRecipient() {
        return recipient;
    }


    /**
     * Sets the recipient value for this DeliveryOnInvoiceAcceptanceDetail.
     * 
     * @param recipient
     */
    public void setRecipient(com.fedex.rate.stub.Party recipient) {
        this.recipient = recipient;
    }


    /**
     * Gets the trackingId value for this DeliveryOnInvoiceAcceptanceDetail.
     * 
     * @return trackingId   * Specifies the tracking id for the return, if preassigned.
     */
    public com.fedex.rate.stub.TrackingId getTrackingId() {
        return trackingId;
    }


    /**
     * Sets the trackingId value for this DeliveryOnInvoiceAcceptanceDetail.
     * 
     * @param trackingId   * Specifies the tracking id for the return, if preassigned.
     */
    public void setTrackingId(com.fedex.rate.stub.TrackingId trackingId) {
        this.trackingId = trackingId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeliveryOnInvoiceAcceptanceDetail)) return false;
        DeliveryOnInvoiceAcceptanceDetail other = (DeliveryOnInvoiceAcceptanceDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.recipient==null && other.getRecipient()==null) || 
             (this.recipient!=null &&
              this.recipient.equals(other.getRecipient()))) &&
            ((this.trackingId==null && other.getTrackingId()==null) || 
             (this.trackingId!=null &&
              this.trackingId.equals(other.getTrackingId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRecipient() != null) {
            _hashCode += getRecipient().hashCode();
        }
        if (getTrackingId() != null) {
            _hashCode += getTrackingId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeliveryOnInvoiceAcceptanceDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v13", "DeliveryOnInvoiceAcceptanceDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipient");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v13", "Recipient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v13", "Party"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v13", "TrackingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v13", "TrackingId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
