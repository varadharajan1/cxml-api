//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.23 at 11:18:10 AM CEST 
//


package org.cxml.fulfill;

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
    "orderReferenceOrMasterAgreementReferenceOrMasterAgreementIDInfoOrOrderIDInfo"
})
@XmlRootElement(name = "ReceiptOrderInfo")
public class ReceiptOrderInfo {

    @XmlElements({
        @XmlElement(name = "OrderReference", required = true, type = OrderReference.class),
        @XmlElement(name = "MasterAgreementReference", required = true, type = MasterAgreementReference.class),
        @XmlElement(name = "MasterAgreementIDInfo", required = true, type = MasterAgreementIDInfo.class),
        @XmlElement(name = "OrderIDInfo", required = true, type = OrderIDInfo.class)
    })
    protected List<Object> orderReferenceOrMasterAgreementReferenceOrMasterAgreementIDInfoOrOrderIDInfo;

    /**
     * Gets the value of the orderReferenceOrMasterAgreementReferenceOrMasterAgreementIDInfoOrOrderIDInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderReferenceOrMasterAgreementReferenceOrMasterAgreementIDInfoOrOrderIDInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderReferenceOrMasterAgreementReferenceOrMasterAgreementIDInfoOrOrderIDInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderReference }
     * {@link MasterAgreementReference }
     * {@link MasterAgreementIDInfo }
     * {@link OrderIDInfo }
     * 
     * 
     */
    public List<Object> getOrderReferenceOrMasterAgreementReferenceOrMasterAgreementIDInfoOrOrderIDInfo() {
        if (orderReferenceOrMasterAgreementReferenceOrMasterAgreementIDInfoOrOrderIDInfo == null) {
            orderReferenceOrMasterAgreementReferenceOrMasterAgreementIDInfoOrOrderIDInfo = new ArrayList<Object>();
        }
        return this.orderReferenceOrMasterAgreementReferenceOrMasterAgreementIDInfoOrOrderIDInfo;
    }

}
