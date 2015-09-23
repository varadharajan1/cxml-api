//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.23 at 11:14:20 AM CEST 
//


package org.cxml.v12028;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "invoiceReferenceOrInvoiceIDInfo",
    "payableOrderInfoOrPayableMasterAgreementInfo"
})
@XmlRootElement(name = "PayableInvoiceInfo")
public class PayableInvoiceInfo {

    @XmlElements({
        @XmlElement(name = "InvoiceReference", required = true, type = InvoiceReference.class),
        @XmlElement(name = "InvoiceIDInfo", required = true, type = InvoiceIDInfo.class)
    })
    protected List<Object> invoiceReferenceOrInvoiceIDInfo;
    @XmlElements({
        @XmlElement(name = "PayableOrderInfo", type = PayableOrderInfo.class),
        @XmlElement(name = "PayableMasterAgreementInfo", type = PayableMasterAgreementInfo.class)
    })
    protected List<Object> payableOrderInfoOrPayableMasterAgreementInfo;

    /**
     * Gets the value of the invoiceReferenceOrInvoiceIDInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceReferenceOrInvoiceIDInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceReferenceOrInvoiceIDInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceReference }
     * {@link InvoiceIDInfo }
     * 
     * 
     */
    public List<Object> getInvoiceReferenceOrInvoiceIDInfo() {
        if (invoiceReferenceOrInvoiceIDInfo == null) {
            invoiceReferenceOrInvoiceIDInfo = new ArrayList<Object>();
        }
        return this.invoiceReferenceOrInvoiceIDInfo;
    }

    /**
     * Gets the value of the payableOrderInfoOrPayableMasterAgreementInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payableOrderInfoOrPayableMasterAgreementInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayableOrderInfoOrPayableMasterAgreementInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PayableOrderInfo }
     * {@link PayableMasterAgreementInfo }
     * 
     * 
     */
    public List<Object> getPayableOrderInfoOrPayableMasterAgreementInfo() {
        if (payableOrderInfoOrPayableMasterAgreementInfo == null) {
            payableOrderInfoOrPayableMasterAgreementInfo = new ArrayList<Object>();
        }
        return this.payableOrderInfoOrPayableMasterAgreementInfo;
    }

}
