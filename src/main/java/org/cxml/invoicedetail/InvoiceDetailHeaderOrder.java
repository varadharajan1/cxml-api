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
    "invoiceDetailOrderInfo",
    "invoiceDetailOrderSummary"
})
@XmlRootElement(name = "InvoiceDetailHeaderOrder")
public class InvoiceDetailHeaderOrder {

    @XmlElement(name = "InvoiceDetailOrderInfo", required = true)
    protected InvoiceDetailOrderInfo invoiceDetailOrderInfo;
    @XmlElement(name = "InvoiceDetailOrderSummary", required = true)
    protected InvoiceDetailOrderSummary invoiceDetailOrderSummary;

    /**
     * Gets the value of the invoiceDetailOrderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDetailOrderInfo }
     *     
     */
    public InvoiceDetailOrderInfo getInvoiceDetailOrderInfo() {
        return invoiceDetailOrderInfo;
    }

    /**
     * Sets the value of the invoiceDetailOrderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDetailOrderInfo }
     *     
     */
    public void setInvoiceDetailOrderInfo(InvoiceDetailOrderInfo value) {
        this.invoiceDetailOrderInfo = value;
    }

    /**
     * Gets the value of the invoiceDetailOrderSummary property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDetailOrderSummary }
     *     
     */
    public InvoiceDetailOrderSummary getInvoiceDetailOrderSummary() {
        return invoiceDetailOrderSummary;
    }

    /**
     * Sets the value of the invoiceDetailOrderSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDetailOrderSummary }
     *     
     */
    public void setInvoiceDetailOrderSummary(InvoiceDetailOrderSummary value) {
        this.invoiceDetailOrderSummary = value;
    }

}
