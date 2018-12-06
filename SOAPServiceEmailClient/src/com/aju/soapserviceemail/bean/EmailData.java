/**
 * EmailData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.aju.soapserviceemail.bean;

public class EmailData  implements java.io.Serializable {
    private java.lang.String bodyOfMail;

    private java.lang.String fromAddress;

    private java.lang.String subjectOfMail;

    private java.lang.String toAddress;

    public EmailData() {
    }

    public EmailData(
           java.lang.String bodyOfMail,
           java.lang.String fromAddress,
           java.lang.String subjectOfMail,
           java.lang.String toAddress) {
           this.bodyOfMail = bodyOfMail;
           this.fromAddress = fromAddress;
           this.subjectOfMail = subjectOfMail;
           this.toAddress = toAddress;
    }


    /**
     * Gets the bodyOfMail value for this EmailData.
     * 
     * @return bodyOfMail
     */
    public java.lang.String getBodyOfMail() {
        return bodyOfMail;
    }


    /**
     * Sets the bodyOfMail value for this EmailData.
     * 
     * @param bodyOfMail
     */
    public void setBodyOfMail(java.lang.String bodyOfMail) {
        this.bodyOfMail = bodyOfMail;
    }


    /**
     * Gets the fromAddress value for this EmailData.
     * 
     * @return fromAddress
     */
    public java.lang.String getFromAddress() {
        return fromAddress;
    }


    /**
     * Sets the fromAddress value for this EmailData.
     * 
     * @param fromAddress
     */
    public void setFromAddress(java.lang.String fromAddress) {
        this.fromAddress = fromAddress;
    }


    /**
     * Gets the subjectOfMail value for this EmailData.
     * 
     * @return subjectOfMail
     */
    public java.lang.String getSubjectOfMail() {
        return subjectOfMail;
    }


    /**
     * Sets the subjectOfMail value for this EmailData.
     * 
     * @param subjectOfMail
     */
    public void setSubjectOfMail(java.lang.String subjectOfMail) {
        this.subjectOfMail = subjectOfMail;
    }


    /**
     * Gets the toAddress value for this EmailData.
     * 
     * @return toAddress
     */
    public java.lang.String getToAddress() {
        return toAddress;
    }


    /**
     * Sets the toAddress value for this EmailData.
     * 
     * @param toAddress
     */
    public void setToAddress(java.lang.String toAddress) {
        this.toAddress = toAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmailData)) return false;
        EmailData other = (EmailData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bodyOfMail==null && other.getBodyOfMail()==null) || 
             (this.bodyOfMail!=null &&
              this.bodyOfMail.equals(other.getBodyOfMail()))) &&
            ((this.fromAddress==null && other.getFromAddress()==null) || 
             (this.fromAddress!=null &&
              this.fromAddress.equals(other.getFromAddress()))) &&
            ((this.subjectOfMail==null && other.getSubjectOfMail()==null) || 
             (this.subjectOfMail!=null &&
              this.subjectOfMail.equals(other.getSubjectOfMail()))) &&
            ((this.toAddress==null && other.getToAddress()==null) || 
             (this.toAddress!=null &&
              this.toAddress.equals(other.getToAddress())));
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
        if (getBodyOfMail() != null) {
            _hashCode += getBodyOfMail().hashCode();
        }
        if (getFromAddress() != null) {
            _hashCode += getFromAddress().hashCode();
        }
        if (getSubjectOfMail() != null) {
            _hashCode += getSubjectOfMail().hashCode();
        }
        if (getToAddress() != null) {
            _hashCode += getToAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmailData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bean.soapserviceemail.aju.com", "EmailData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bodyOfMail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.soapserviceemail.aju.com", "bodyOfMail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.soapserviceemail.aju.com", "fromAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjectOfMail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.soapserviceemail.aju.com", "subjectOfMail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.soapserviceemail.aju.com", "toAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
