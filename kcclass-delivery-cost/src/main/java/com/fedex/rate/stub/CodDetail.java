/**
 * CodDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.rate.stub;


/**
 * Descriptive data required for a FedEx COD (Collect-On-Delivery)
 * shipment.
 */
public class CodDetail  implements java.io.Serializable {
    private com.fedex.rate.stub.Money codCollectionAmount;

    /* Specifies the details of the charges are to be added to the
     * COD collect amount. */
    private com.fedex.rate.stub.CodAddTransportationChargesDetail addTransportationChargesDetail;

    /* Identifies the type of funds FedEx should collect upon package
     * delivery */
    private com.fedex.rate.stub.CodCollectionType collectionType;

    /* For Express this is the descriptive data that is used for the
     * recipient of the FedEx Letter containing the COD payment. For Ground
     * this is the descriptive data for the party to receive the payment
     * that prints the COD receipt. */
    private com.fedex.rate.stub.Party codRecipient;

    /* When the FedEx COD payment type is not CASH, indicates the
     * contact and address of the financial institution used to service the
     * payment of the COD. */
    private com.fedex.rate.stub.ContactAndAddress financialInstitutionContactAndAddress;

    /* Specifies the name of person or company receiving the secured/unsecured
     * funds payment */
    private java.lang.String remitToName;

    /* Indicates which type of reference information to include on
     * the COD return shipping label. */
    private com.fedex.rate.stub.CodReturnReferenceIndicatorType referenceIndicator;

    /* Only used with multi-piece COD shipments sent in multiple transactions.
     * Required on last transaction only. */
    private com.fedex.rate.stub.TrackingId returnTrackingId;

    public CodDetail() {
    }

    public CodDetail(
           com.fedex.rate.stub.Money codCollectionAmount,
           com.fedex.rate.stub.CodAddTransportationChargesDetail addTransportationChargesDetail,
           com.fedex.rate.stub.CodCollectionType collectionType,
           com.fedex.rate.stub.Party codRecipient,
           com.fedex.rate.stub.ContactAndAddress financialInstitutionContactAndAddress,
           java.lang.String remitToName,
           com.fedex.rate.stub.CodReturnReferenceIndicatorType referenceIndicator,
           com.fedex.rate.stub.TrackingId returnTrackingId) {
           this.codCollectionAmount = codCollectionAmount;
           this.addTransportationChargesDetail = addTransportationChargesDetail;
           this.collectionType = collectionType;
           this.codRecipient = codRecipient;
           this.financialInstitutionContactAndAddress = financialInstitutionContactAndAddress;
           this.remitToName = remitToName;
           this.referenceIndicator = referenceIndicator;
           this.returnTrackingId = returnTrackingId;
    }


    /**
     * Gets the codCollectionAmount value for this CodDetail.
     * 
     * @return codCollectionAmount
     */
    public com.fedex.rate.stub.Money getCodCollectionAmount() {
        return codCollectionAmount;
    }


    /**
     * Sets the codCollectionAmount value for this CodDetail.
     * 
     * @param codCollectionAmount
     */
    public void setCodCollectionAmount(com.fedex.rate.stub.Money codCollectionAmount) {
        this.codCollectionAmount = codCollectionAmount;
    }


    /**
     * Gets the addTransportationChargesDetail value for this CodDetail.
     * 
     * @return addTransportationChargesDetail   * Specifies the details of the charges are to be added to the
     * COD collect amount.
     */
    public com.fedex.rate.stub.CodAddTransportationChargesDetail getAddTransportationChargesDetail() {
        return addTransportationChargesDetail;
    }


    /**
     * Sets the addTransportationChargesDetail value for this CodDetail.
     * 
     * @param addTransportationChargesDetail   * Specifies the details of the charges are to be added to the
     * COD collect amount.
     */
    public void setAddTransportationChargesDetail(com.fedex.rate.stub.CodAddTransportationChargesDetail addTransportationChargesDetail) {
        this.addTransportationChargesDetail = addTransportationChargesDetail;
    }


    /**
     * Gets the collectionType value for this CodDetail.
     * 
     * @return collectionType   * Identifies the type of funds FedEx should collect upon package
     * delivery
     */
    public com.fedex.rate.stub.CodCollectionType getCollectionType() {
        return collectionType;
    }


    /**
     * Sets the collectionType value for this CodDetail.
     * 
     * @param collectionType   * Identifies the type of funds FedEx should collect upon package
     * delivery
     */
    public void setCollectionType(com.fedex.rate.stub.CodCollectionType collectionType) {
        this.collectionType = collectionType;
    }


    /**
     * Gets the codRecipient value for this CodDetail.
     * 
     * @return codRecipient   * For Express this is the descriptive data that is used for the
     * recipient of the FedEx Letter containing the COD payment. For Ground
     * this is the descriptive data for the party to receive the payment
     * that prints the COD receipt.
     */
    public com.fedex.rate.stub.Party getCodRecipient() {
        return codRecipient;
    }


    /**
     * Sets the codRecipient value for this CodDetail.
     * 
     * @param codRecipient   * For Express this is the descriptive data that is used for the
     * recipient of the FedEx Letter containing the COD payment. For Ground
     * this is the descriptive data for the party to receive the payment
     * that prints the COD receipt.
     */
    public void setCodRecipient(com.fedex.rate.stub.Party codRecipient) {
        this.codRecipient = codRecipient;
    }


    /**
     * Gets the financialInstitutionContactAndAddress value for this CodDetail.
     * 
     * @return financialInstitutionContactAndAddress   * When the FedEx COD payment type is not CASH, indicates the
     * contact and address of the financial institution used to service the
     * payment of the COD.
     */
    public com.fedex.rate.stub.ContactAndAddress getFinancialInstitutionContactAndAddress() {
        return financialInstitutionContactAndAddress;
    }


    /**
     * Sets the financialInstitutionContactAndAddress value for this CodDetail.
     * 
     * @param financialInstitutionContactAndAddress   * When the FedEx COD payment type is not CASH, indicates the
     * contact and address of the financial institution used to service the
     * payment of the COD.
     */
    public void setFinancialInstitutionContactAndAddress(com.fedex.rate.stub.ContactAndAddress financialInstitutionContactAndAddress) {
        this.financialInstitutionContactAndAddress = financialInstitutionContactAndAddress;
    }


    /**
     * Gets the remitToName value for this CodDetail.
     * 
     * @return remitToName   * Specifies the name of person or company receiving the secured/unsecured
     * funds payment
     */
    public java.lang.String getRemitToName() {
        return remitToName;
    }


    /**
     * Sets the remitToName value for this CodDetail.
     * 
     * @param remitToName   * Specifies the name of person or company receiving the secured/unsecured
     * funds payment
     */
    public void setRemitToName(java.lang.String remitToName) {
        this.remitToName = remitToName;
    }


    /**
     * Gets the referenceIndicator value for this CodDetail.
     * 
     * @return referenceIndicator   * Indicates which type of reference information to include on
     * the COD return shipping label.
     */
    public com.fedex.rate.stub.CodReturnReferenceIndicatorType getReferenceIndicator() {
        return referenceIndicator;
    }


    /**
     * Sets the referenceIndicator value for this CodDetail.
     * 
     * @param referenceIndicator   * Indicates which type of reference information to include on
     * the COD return shipping label.
     */
    public void setReferenceIndicator(com.fedex.rate.stub.CodReturnReferenceIndicatorType referenceIndicator) {
        this.referenceIndicator = referenceIndicator;
    }


    /**
     * Gets the returnTrackingId value for this CodDetail.
     * 
     * @return returnTrackingId   * Only used with multi-piece COD shipments sent in multiple transactions.
     * Required on last transaction only.
     */
    public com.fedex.rate.stub.TrackingId getReturnTrackingId() {
        return returnTrackingId;
    }


    /**
     * Sets the returnTrackingId value for this CodDetail.
     * 
     * @param returnTrackingId   * Only used with multi-piece COD shipments sent in multiple transactions.
     * Required on last transaction only.
     */
    public void setReturnTrackingId(com.fedex.rate.stub.TrackingId returnTrackingId) {
        this.returnTrackingId = returnTrackingId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CodDetail)) return false;
        CodDetail other = (CodDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codCollectionAmount==null && other.getCodCollectionAmount()==null) || 
             (this.codCollectionAmount!=null &&
              this.codCollectionAmount.equals(other.getCodCollectionAmount()))) &&
            ((this.addTransportationChargesDetail==null && other.getAddTransportationChargesDetail()==null) || 
             (this.addTransportationChargesDetail!=null &&
              this.addTransportationChargesDetail.equals(other.getAddTransportationChargesDetail()))) &&
            ((this.collectionType==null && other.getCollectionType()==null) || 
             (this.collectionType!=null &&
              this.collectionType.equals(other.getCollectionType()))) &&
            ((this.codRecipient==null && other.getCodRecipient()==null) || 
             (this.codRecipient!=null &&
              this.codRecipient.equals(other.getCodRecipient()))) &&
            ((this.financialInstitutionContactAndAddress==null && other.getFinancialInstitutionContactAndAddress()==null) || 
             (this.financialInstitutionContactAndAddress!=null &&
              this.financialInstitutionContactAndAddress.equals(other.getFinancialInstitutionContactAndAddress()))) &&
            ((this.remitToName==null && other.getRemitToName()==null) || 
             (this.remitToName!=null &&
              this.remitToName.equals(other.getRemitToName()))) &&
            ((this.referenceIndicator==null && other.getReferenceIndicator()==null) || 
             (this.referenceIndicator!=null &&
              this.referenceIndicator.equals(other.getReferenceIndicator()))) &&
            ((this.returnTrackingId==null && other.getReturnTrackingId()==null) || 
             (this.returnTrackingId!=null &&
              this.returnTrackingId.equals(other.getReturnTrackingId())));
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
        if (getCodCollectionAmount() != null) {
            _hashCode += getCodCollectionAmount().hashCode();
        }
        if (getAddTransportationChargesDetail() != null) {
            _hashCode += getAddTransportationChargesDetail().hashCode();
        }
        if (getCollectionType() != null) {
            _hashCode += getCollectionType().hashCode();
        }
        if (getCodRecipient() != null) {
            _hashCode += getCodRecipient().hashCode();
        }
        if (getFinancialInstitutionContactAndAddress() != null) {
            _hashCode += getFinancialInstitutionContactAndAddress().hashCode();
        }
        if (getRemitToName() != null) {
            _hashCode += getRemitToName().hashCode();
        }
        if (getReferenceIndicator() != null) {
            _hashCode += getReferenceIndicator().hashCode();
        }
        if (getReturnTrackingId() != null) {
            _hashCode += getReturnTrackingId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CodDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v13", "CodDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codCollectionAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v13", "CodCollectionAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v13", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addTransportationChargesDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v13", "AddTransportationChargesDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v13", "CodAddTransportationChargesDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collectionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v13", "CollectionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v13", "CodCollectionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codRecipient");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v13", "CodRecipient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v13", "Party"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("financialInstitutionContactAndAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v13", "FinancialInstitutionContactAndAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v13", "ContactAndAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remitToName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v13", "RemitToName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v13", "ReferenceIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v13", "CodReturnReferenceIndicatorType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnTrackingId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v13", "ReturnTrackingId"));
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
