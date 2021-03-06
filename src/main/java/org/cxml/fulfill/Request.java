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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "confirmationRequestOrShipNoticeRequestOrServiceEntryRequestOrCopyRequestOrTimeCardInfoRequestOrReceiptRequestOrOrderStatusRequestOrTimeCardRequestOrComponentConsumptionRequest"
})
@XmlRootElement(name = "Request")
public class Request {

    @XmlAttribute(name = "deploymentMode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String deploymentMode;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlElements({
        @XmlElement(name = "ConfirmationRequest", required = true, type = ConfirmationRequest.class),
        @XmlElement(name = "ShipNoticeRequest", required = true, type = ShipNoticeRequest.class),
        @XmlElement(name = "ServiceEntryRequest", required = true, type = ServiceEntryRequest.class),
        @XmlElement(name = "CopyRequest", required = true, type = CopyRequest.class),
        @XmlElement(name = "TimeCardInfoRequest", required = true, type = TimeCardInfoRequest.class),
        @XmlElement(name = "ReceiptRequest", required = true, type = ReceiptRequest.class),
        @XmlElement(name = "OrderStatusRequest", required = true, type = OrderStatusRequest.class),
        @XmlElement(name = "TimeCardRequest", required = true, type = TimeCardRequest.class),
        @XmlElement(name = "ComponentConsumptionRequest", required = true, type = ComponentConsumptionRequest.class)
    })
    protected List<Object> confirmationRequestOrShipNoticeRequestOrServiceEntryRequestOrCopyRequestOrTimeCardInfoRequestOrReceiptRequestOrOrderStatusRequestOrTimeCardRequestOrComponentConsumptionRequest;

    /**
     * Gets the value of the deploymentMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeploymentMode() {
        if (deploymentMode == null) {
            return "production";
        } else {
            return deploymentMode;
        }
    }

    /**
     * Sets the value of the deploymentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeploymentMode(String value) {
        this.deploymentMode = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the confirmationRequestOrShipNoticeRequestOrServiceEntryRequestOrCopyRequestOrTimeCardInfoRequestOrReceiptRequestOrOrderStatusRequestOrTimeCardRequestOrComponentConsumptionRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the confirmationRequestOrShipNoticeRequestOrServiceEntryRequestOrCopyRequestOrTimeCardInfoRequestOrReceiptRequestOrOrderStatusRequestOrTimeCardRequestOrComponentConsumptionRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfirmationRequestOrShipNoticeRequestOrServiceEntryRequestOrCopyRequestOrTimeCardInfoRequestOrReceiptRequestOrOrderStatusRequestOrTimeCardRequestOrComponentConsumptionRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfirmationRequest }
     * {@link ShipNoticeRequest }
     * {@link ServiceEntryRequest }
     * {@link CopyRequest }
     * {@link TimeCardInfoRequest }
     * {@link ReceiptRequest }
     * {@link OrderStatusRequest }
     * {@link TimeCardRequest }
     * {@link ComponentConsumptionRequest }
     * 
     * 
     */
    public List<Object> getConfirmationRequestOrShipNoticeRequestOrServiceEntryRequestOrCopyRequestOrTimeCardInfoRequestOrReceiptRequestOrOrderStatusRequestOrTimeCardRequestOrComponentConsumptionRequest() {
        if (confirmationRequestOrShipNoticeRequestOrServiceEntryRequestOrCopyRequestOrTimeCardInfoRequestOrReceiptRequestOrOrderStatusRequestOrTimeCardRequestOrComponentConsumptionRequest == null) {
            confirmationRequestOrShipNoticeRequestOrServiceEntryRequestOrCopyRequestOrTimeCardInfoRequestOrReceiptRequestOrOrderStatusRequestOrTimeCardRequestOrComponentConsumptionRequest = new ArrayList<Object>();
        }
        return this.confirmationRequestOrShipNoticeRequestOrServiceEntryRequestOrCopyRequestOrTimeCardInfoRequestOrReceiptRequestOrOrderStatusRequestOrTimeCardRequestOrComponentConsumptionRequest;
    }

}
