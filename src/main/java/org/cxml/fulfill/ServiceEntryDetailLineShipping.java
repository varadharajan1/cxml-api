//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.23 at 11:18:10 AM CEST 
//


package org.cxml.fulfill;

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
    "serviceEntryDetailShipping",
    "money"
})
@XmlRootElement(name = "ServiceEntryDetailLineShipping")
public class ServiceEntryDetailLineShipping {

    @XmlElement(name = "ServiceEntryDetailShipping", required = true)
    protected ServiceEntryDetailShipping serviceEntryDetailShipping;
    @XmlElement(name = "Money", required = true)
    protected Money money;

    /**
     * Gets the value of the serviceEntryDetailShipping property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceEntryDetailShipping }
     *     
     */
    public ServiceEntryDetailShipping getServiceEntryDetailShipping() {
        return serviceEntryDetailShipping;
    }

    /**
     * Sets the value of the serviceEntryDetailShipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceEntryDetailShipping }
     *     
     */
    public void setServiceEntryDetailShipping(ServiceEntryDetailShipping value) {
        this.serviceEntryDetailShipping = value;
    }

    /**
     * Gets the value of the money property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getMoney() {
        return money;
    }

    /**
     * Sets the value of the money property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setMoney(Money value) {
        this.money = value;
    }

}
