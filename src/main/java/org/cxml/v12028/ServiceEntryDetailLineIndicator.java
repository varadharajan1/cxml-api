//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.23 at 11:18:10 AM CEST 
//


package org.cxml.v12028;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ServiceEntryDetailLineIndicator")
public class ServiceEntryDetailLineIndicator {

    @XmlAttribute(name = "isTaxInLine")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isTaxInLine;
    @XmlAttribute(name = "isSpecialHandlingInLine")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isSpecialHandlingInLine;
    @XmlAttribute(name = "isShippingInLine")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isShippingInLine;
    @XmlAttribute(name = "isDiscountInLine")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isDiscountInLine;
    @XmlAttribute(name = "isAccountingInLine")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isAccountingInLine;

    /**
     * Gets the value of the isTaxInLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsTaxInLine() {
        return isTaxInLine;
    }

    /**
     * Sets the value of the isTaxInLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsTaxInLine(String value) {
        this.isTaxInLine = value;
    }

    /**
     * Gets the value of the isSpecialHandlingInLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSpecialHandlingInLine() {
        return isSpecialHandlingInLine;
    }

    /**
     * Sets the value of the isSpecialHandlingInLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSpecialHandlingInLine(String value) {
        this.isSpecialHandlingInLine = value;
    }

    /**
     * Gets the value of the isShippingInLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsShippingInLine() {
        return isShippingInLine;
    }

    /**
     * Sets the value of the isShippingInLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsShippingInLine(String value) {
        this.isShippingInLine = value;
    }

    /**
     * Gets the value of the isDiscountInLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDiscountInLine() {
        return isDiscountInLine;
    }

    /**
     * Sets the value of the isDiscountInLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDiscountInLine(String value) {
        this.isDiscountInLine = value;
    }

    /**
     * Gets the value of the isAccountingInLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAccountingInLine() {
        return isAccountingInLine;
    }

    /**
     * Sets the value of the isAccountingInLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAccountingInLine(String value) {
        this.isAccountingInLine = value;
    }

}
