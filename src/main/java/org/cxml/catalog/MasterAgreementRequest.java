//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.23 at 11:07:02 AM CEST 
//


package org.cxml.catalog;

import java.util.ArrayList;
import java.util.List;
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
    "masterAgreementRequestHeader",
    "agreementItemOut"
})
@XmlRootElement(name = "MasterAgreementRequest")
public class MasterAgreementRequest {

    @XmlElement(name = "MasterAgreementRequestHeader", required = true)
    protected MasterAgreementRequestHeader masterAgreementRequestHeader;
    @XmlElement(name = "AgreementItemOut")
    protected List<AgreementItemOut> agreementItemOut;

    /**
     * Gets the value of the masterAgreementRequestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link MasterAgreementRequestHeader }
     *     
     */
    public MasterAgreementRequestHeader getMasterAgreementRequestHeader() {
        return masterAgreementRequestHeader;
    }

    /**
     * Sets the value of the masterAgreementRequestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterAgreementRequestHeader }
     *     
     */
    public void setMasterAgreementRequestHeader(MasterAgreementRequestHeader value) {
        this.masterAgreementRequestHeader = value;
    }

    /**
     * Gets the value of the agreementItemOut property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agreementItemOut property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgreementItemOut().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgreementItemOut }
     * 
     * 
     */
    public List<AgreementItemOut> getAgreementItemOut() {
        if (agreementItemOut == null) {
            agreementItemOut = new ArrayList<AgreementItemOut>();
        }
        return this.agreementItemOut;
    }

}
