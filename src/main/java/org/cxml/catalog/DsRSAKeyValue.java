//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.23 at 11:07:02 AM CEST 
//


package org.cxml.catalog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dsModulus",
    "dsExponent"
})
@XmlRootElement(name = "ds:RSAKeyValue")
public class DsRSAKeyValue {

    @XmlElement(name = "ds:Modulus", required = true)
    protected String dsModulus;
    @XmlElement(name = "ds:Exponent", required = true)
    protected String dsExponent;

    /**
     * Gets the value of the dsModulus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsModulus() {
        return dsModulus;
    }

    /**
     * Sets the value of the dsModulus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsModulus(String value) {
        this.dsModulus = value;
    }

    /**
     * Gets the value of the dsExponent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsExponent() {
        return dsExponent;
    }

    /**
     * Sets the value of the dsExponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsExponent(String value) {
        this.dsExponent = value;
    }

}
