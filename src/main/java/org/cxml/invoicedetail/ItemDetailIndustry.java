//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.23 at 10:57:51 AM CEST 
//


package org.cxml.invoicedetail;

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
    "itemDetailRetail"
})
@XmlRootElement(name = "ItemDetailIndustry")
public class ItemDetailIndustry {

    @XmlElement(name = "ItemDetailRetail")
    protected ItemDetailRetail itemDetailRetail;

    /**
     * Gets the value of the itemDetailRetail property.
     * 
     * @return
     *     possible object is
     *     {@link ItemDetailRetail }
     *     
     */
    public ItemDetailRetail getItemDetailRetail() {
        return itemDetailRetail;
    }

    /**
     * Sets the value of the itemDetailRetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemDetailRetail }
     *     
     */
    public void setItemDetailRetail(ItemDetailRetail value) {
        this.itemDetailRetail = value;
    }

}
