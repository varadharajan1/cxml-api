//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.23 at 10:57:51 AM CEST 
//


package org.cxml.v12028;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "invoiceDetailServiceItemReference",
    "serviceEntryItemReferenceOrServiceEntryItemIDInfo",
    "subtotalAmount",
    "period",
    "unitRateOrUnitOfMeasureOrUnitPriceOrPriceBasisQuantity",
    "tax",
    "grossAmount",
    "invoiceDetailDiscount",
    "invoiceItemModifications",
    "totalCharges",
    "totalAllowances",
    "totalAmountWithoutTax",
    "netAmount",
    "distribution",
    "comments",
    "invoiceLaborDetail",
    "extrinsic"
})
@XmlRootElement(name = "InvoiceDetailServiceItem")
public class InvoiceDetailServiceItem {

    @XmlAttribute(name = "invoiceLineNumber", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String invoiceLineNumber;
    @XmlAttribute(name = "quantity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String quantity;
    @XmlAttribute(name = "referenceDate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String referenceDate;
    @XmlAttribute(name = "inspectionDate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String inspectionDate;
    @XmlAttribute(name = "parentInvoiceLineNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String parentInvoiceLineNumber;
    @XmlAttribute(name = "itemType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String itemType;
    @XmlElement(name = "InvoiceDetailServiceItemReference", required = true)
    protected InvoiceDetailServiceItemReference invoiceDetailServiceItemReference;
    @XmlElements({
        @XmlElement(name = "ServiceEntryItemReference", type = ServiceEntryItemReference.class),
        @XmlElement(name = "ServiceEntryItemIDInfo", type = ServiceEntryItemIDInfo.class)
    })
    protected List<Object> serviceEntryItemReferenceOrServiceEntryItemIDInfo;
    @XmlElement(name = "SubtotalAmount", required = true)
    protected SubtotalAmount subtotalAmount;
    @XmlElement(name = "Period")
    protected Period period;
    @XmlElements({
        @XmlElement(name = "UnitRate", type = UnitRate.class),
        @XmlElement(name = "UnitOfMeasure", type = UnitOfMeasure.class),
        @XmlElement(name = "UnitPrice", type = UnitPrice.class),
        @XmlElement(name = "PriceBasisQuantity", type = PriceBasisQuantity.class)
    })
    protected List<Object> unitRateOrUnitOfMeasureOrUnitPriceOrPriceBasisQuantity;
    @XmlElement(name = "Tax")
    protected Tax tax;
    @XmlElement(name = "GrossAmount")
    protected GrossAmount grossAmount;
    @XmlElement(name = "InvoiceDetailDiscount")
    protected InvoiceDetailDiscount invoiceDetailDiscount;
    @XmlElement(name = "InvoiceItemModifications")
    protected InvoiceItemModifications invoiceItemModifications;
    @XmlElement(name = "TotalCharges")
    protected TotalCharges totalCharges;
    @XmlElement(name = "TotalAllowances")
    protected TotalAllowances totalAllowances;
    @XmlElement(name = "TotalAmountWithoutTax")
    protected TotalAmountWithoutTax totalAmountWithoutTax;
    @XmlElement(name = "NetAmount")
    protected NetAmount netAmount;
    @XmlElement(name = "Distribution")
    protected List<Distribution> distribution;
    @XmlElement(name = "Comments")
    protected Comments comments;
    @XmlElement(name = "InvoiceLaborDetail")
    protected InvoiceLaborDetail invoiceLaborDetail;
    @XmlElement(name = "Extrinsic")
    protected List<Extrinsic> extrinsic;

    /**
     * Gets the value of the invoiceLineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceLineNumber() {
        return invoiceLineNumber;
    }

    /**
     * Sets the value of the invoiceLineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceLineNumber(String value) {
        this.invoiceLineNumber = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the referenceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceDate() {
        return referenceDate;
    }

    /**
     * Sets the value of the referenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceDate(String value) {
        this.referenceDate = value;
    }

    /**
     * Gets the value of the inspectionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInspectionDate() {
        return inspectionDate;
    }

    /**
     * Sets the value of the inspectionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInspectionDate(String value) {
        this.inspectionDate = value;
    }

    /**
     * Gets the value of the parentInvoiceLineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentInvoiceLineNumber() {
        return parentInvoiceLineNumber;
    }

    /**
     * Sets the value of the parentInvoiceLineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentInvoiceLineNumber(String value) {
        this.parentInvoiceLineNumber = value;
    }

    /**
     * Gets the value of the itemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemType() {
        return itemType;
    }

    /**
     * Sets the value of the itemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemType(String value) {
        this.itemType = value;
    }

    /**
     * Gets the value of the invoiceDetailServiceItemReference property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDetailServiceItemReference }
     *     
     */
    public InvoiceDetailServiceItemReference getInvoiceDetailServiceItemReference() {
        return invoiceDetailServiceItemReference;
    }

    /**
     * Sets the value of the invoiceDetailServiceItemReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDetailServiceItemReference }
     *     
     */
    public void setInvoiceDetailServiceItemReference(InvoiceDetailServiceItemReference value) {
        this.invoiceDetailServiceItemReference = value;
    }

    /**
     * Gets the value of the serviceEntryItemReferenceOrServiceEntryItemIDInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceEntryItemReferenceOrServiceEntryItemIDInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceEntryItemReferenceOrServiceEntryItemIDInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceEntryItemReference }
     * {@link ServiceEntryItemIDInfo }
     * 
     * 
     */
    public List<Object> getServiceEntryItemReferenceOrServiceEntryItemIDInfo() {
        if (serviceEntryItemReferenceOrServiceEntryItemIDInfo == null) {
            serviceEntryItemReferenceOrServiceEntryItemIDInfo = new ArrayList<Object>();
        }
        return this.serviceEntryItemReferenceOrServiceEntryItemIDInfo;
    }

    /**
     * Gets the value of the subtotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link SubtotalAmount }
     *     
     */
    public SubtotalAmount getSubtotalAmount() {
        return subtotalAmount;
    }

    /**
     * Sets the value of the subtotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubtotalAmount }
     *     
     */
    public void setSubtotalAmount(SubtotalAmount value) {
        this.subtotalAmount = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setPeriod(Period value) {
        this.period = value;
    }

    /**
     * Gets the value of the unitRateOrUnitOfMeasureOrUnitPriceOrPriceBasisQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitRateOrUnitOfMeasureOrUnitPriceOrPriceBasisQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitRateOrUnitOfMeasureOrUnitPriceOrPriceBasisQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitRate }
     * {@link UnitOfMeasure }
     * {@link UnitPrice }
     * {@link PriceBasisQuantity }
     * 
     * 
     */
    public List<Object> getUnitRateOrUnitOfMeasureOrUnitPriceOrPriceBasisQuantity() {
        if (unitRateOrUnitOfMeasureOrUnitPriceOrPriceBasisQuantity == null) {
            unitRateOrUnitOfMeasureOrUnitPriceOrPriceBasisQuantity = new ArrayList<Object>();
        }
        return this.unitRateOrUnitOfMeasureOrUnitPriceOrPriceBasisQuantity;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link Tax }
     *     
     */
    public Tax getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tax }
     *     
     */
    public void setTax(Tax value) {
        this.tax = value;
    }

    /**
     * Gets the value of the grossAmount property.
     * 
     * @return
     *     possible object is
     *     {@link GrossAmount }
     *     
     */
    public GrossAmount getGrossAmount() {
        return grossAmount;
    }

    /**
     * Sets the value of the grossAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrossAmount }
     *     
     */
    public void setGrossAmount(GrossAmount value) {
        this.grossAmount = value;
    }

    /**
     * Gets the value of the invoiceDetailDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDetailDiscount }
     *     
     */
    public InvoiceDetailDiscount getInvoiceDetailDiscount() {
        return invoiceDetailDiscount;
    }

    /**
     * Sets the value of the invoiceDetailDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDetailDiscount }
     *     
     */
    public void setInvoiceDetailDiscount(InvoiceDetailDiscount value) {
        this.invoiceDetailDiscount = value;
    }

    /**
     * Gets the value of the invoiceItemModifications property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceItemModifications }
     *     
     */
    public InvoiceItemModifications getInvoiceItemModifications() {
        return invoiceItemModifications;
    }

    /**
     * Sets the value of the invoiceItemModifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceItemModifications }
     *     
     */
    public void setInvoiceItemModifications(InvoiceItemModifications value) {
        this.invoiceItemModifications = value;
    }

    /**
     * Gets the value of the totalCharges property.
     * 
     * @return
     *     possible object is
     *     {@link TotalCharges }
     *     
     */
    public TotalCharges getTotalCharges() {
        return totalCharges;
    }

    /**
     * Sets the value of the totalCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalCharges }
     *     
     */
    public void setTotalCharges(TotalCharges value) {
        this.totalCharges = value;
    }

    /**
     * Gets the value of the totalAllowances property.
     * 
     * @return
     *     possible object is
     *     {@link TotalAllowances }
     *     
     */
    public TotalAllowances getTotalAllowances() {
        return totalAllowances;
    }

    /**
     * Sets the value of the totalAllowances property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalAllowances }
     *     
     */
    public void setTotalAllowances(TotalAllowances value) {
        this.totalAllowances = value;
    }

    /**
     * Gets the value of the totalAmountWithoutTax property.
     * 
     * @return
     *     possible object is
     *     {@link TotalAmountWithoutTax }
     *     
     */
    public TotalAmountWithoutTax getTotalAmountWithoutTax() {
        return totalAmountWithoutTax;
    }

    /**
     * Sets the value of the totalAmountWithoutTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalAmountWithoutTax }
     *     
     */
    public void setTotalAmountWithoutTax(TotalAmountWithoutTax value) {
        this.totalAmountWithoutTax = value;
    }

    /**
     * Gets the value of the netAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NetAmount }
     *     
     */
    public NetAmount getNetAmount() {
        return netAmount;
    }

    /**
     * Sets the value of the netAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetAmount }
     *     
     */
    public void setNetAmount(NetAmount value) {
        this.netAmount = value;
    }

    /**
     * Gets the value of the distribution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distribution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistribution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Distribution }
     * 
     * 
     */
    public List<Distribution> getDistribution() {
        if (distribution == null) {
            distribution = new ArrayList<Distribution>();
        }
        return this.distribution;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link Comments }
     *     
     */
    public Comments getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Comments }
     *     
     */
    public void setComments(Comments value) {
        this.comments = value;
    }

    /**
     * Gets the value of the invoiceLaborDetail property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceLaborDetail }
     *     
     */
    public InvoiceLaborDetail getInvoiceLaborDetail() {
        return invoiceLaborDetail;
    }

    /**
     * Sets the value of the invoiceLaborDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceLaborDetail }
     *     
     */
    public void setInvoiceLaborDetail(InvoiceLaborDetail value) {
        this.invoiceLaborDetail = value;
    }

    /**
     * Gets the value of the extrinsic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extrinsic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtrinsic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extrinsic }
     * 
     * 
     */
    public List<Extrinsic> getExtrinsic() {
        if (extrinsic == null) {
            extrinsic = new ArrayList<Extrinsic>();
        }
        return this.extrinsic;
    }

}
