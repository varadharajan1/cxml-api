//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.23 at 11:18:10 AM CEST 
//


package org.cxml.v12028;

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
    "serviceEntryRequestHeader",
    "serviceEntryOrder",
    "serviceEntrySummary"
})
@XmlRootElement(name = "ServiceEntryRequest")
public class ServiceEntryRequest {

    @XmlElement(name = "ServiceEntryRequestHeader", required = true)
    protected ServiceEntryRequestHeader serviceEntryRequestHeader;
    @XmlElement(name = "ServiceEntryOrder", required = true)
    protected ServiceEntryOrder serviceEntryOrder;
    @XmlElement(name = "ServiceEntrySummary", required = true)
    protected ServiceEntrySummary serviceEntrySummary;

    /**
     * Gets the value of the serviceEntryRequestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceEntryRequestHeader }
     *     
     */
    public ServiceEntryRequestHeader getServiceEntryRequestHeader() {
        return serviceEntryRequestHeader;
    }

    /**
     * Sets the value of the serviceEntryRequestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceEntryRequestHeader }
     *     
     */
    public void setServiceEntryRequestHeader(ServiceEntryRequestHeader value) {
        this.serviceEntryRequestHeader = value;
    }

    /**
     * Gets the value of the serviceEntryOrder property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceEntryOrder }
     *     
     */
    public ServiceEntryOrder getServiceEntryOrder() {
        return serviceEntryOrder;
    }

    /**
     * Sets the value of the serviceEntryOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceEntryOrder }
     *     
     */
    public void setServiceEntryOrder(ServiceEntryOrder value) {
        this.serviceEntryOrder = value;
    }

    /**
     * Gets the value of the serviceEntrySummary property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceEntrySummary }
     *     
     */
    public ServiceEntrySummary getServiceEntrySummary() {
        return serviceEntrySummary;
    }

    /**
     * Sets the value of the serviceEntrySummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceEntrySummary }
     *     
     */
    public void setServiceEntrySummary(ServiceEntrySummary value) {
        this.serviceEntrySummary = value;
    }

}
