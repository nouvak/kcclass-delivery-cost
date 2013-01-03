/**
 * ShipmentConfigurationData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.rate.stub;


/**
 * Specifies data structures that may be re-used multiple times with
 * s single shipment.
 */
public class ShipmentConfigurationData  implements java.io.Serializable {
    /* Specifies the data that is common to dangerous goods packages
     * in the shipment. This is populated when the shipment contains packages
     * with identical dangerous goods commodities. */
    private com.fedex.rate.stub.DangerousGoodsDetail[] dangerousGoodsPackageConfigurations;

    public ShipmentConfigurationData() {
    }

    public ShipmentConfigurationData(
           com.fedex.rate.stub.DangerousGoodsDetail[] dangerousGoodsPackageConfigurations) {
           this.dangerousGoodsPackageConfigurations = dangerousGoodsPackageConfigurations;
    }


    /**
     * Gets the dangerousGoodsPackageConfigurations value for this ShipmentConfigurationData.
     * 
     * @return dangerousGoodsPackageConfigurations   * Specifies the data that is common to dangerous goods packages
     * in the shipment. This is populated when the shipment contains packages
     * with identical dangerous goods commodities.
     */
    public com.fedex.rate.stub.DangerousGoodsDetail[] getDangerousGoodsPackageConfigurations() {
        return dangerousGoodsPackageConfigurations;
    }


    /**
     * Sets the dangerousGoodsPackageConfigurations value for this ShipmentConfigurationData.
     * 
     * @param dangerousGoodsPackageConfigurations   * Specifies the data that is common to dangerous goods packages
     * in the shipment. This is populated when the shipment contains packages
     * with identical dangerous goods commodities.
     */
    public void setDangerousGoodsPackageConfigurations(com.fedex.rate.stub.DangerousGoodsDetail[] dangerousGoodsPackageConfigurations) {
        this.dangerousGoodsPackageConfigurations = dangerousGoodsPackageConfigurations;
    }

    public com.fedex.rate.stub.DangerousGoodsDetail getDangerousGoodsPackageConfigurations(int i) {
        return this.dangerousGoodsPackageConfigurations[i];
    }

    public void setDangerousGoodsPackageConfigurations(int i, com.fedex.rate.stub.DangerousGoodsDetail _value) {
        this.dangerousGoodsPackageConfigurations[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShipmentConfigurationData)) return false;
        ShipmentConfigurationData other = (ShipmentConfigurationData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dangerousGoodsPackageConfigurations==null && other.getDangerousGoodsPackageConfigurations()==null) || 
             (this.dangerousGoodsPackageConfigurations!=null &&
              java.util.Arrays.equals(this.dangerousGoodsPackageConfigurations, other.getDangerousGoodsPackageConfigurations())));
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
        if (getDangerousGoodsPackageConfigurations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDangerousGoodsPackageConfigurations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDangerousGoodsPackageConfigurations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShipmentConfigurationData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v13", "ShipmentConfigurationData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dangerousGoodsPackageConfigurations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v13", "DangerousGoodsPackageConfigurations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v13", "DangerousGoodsDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
