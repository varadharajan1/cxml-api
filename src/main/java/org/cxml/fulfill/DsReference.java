//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.23 at 11:18:10 AM CEST 
//


package org.cxml.fulfill;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
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
    "dsTransforms",
    "dsDigestMethod",
    "dsDigestValue"
})
@XmlRootElement(name = "ds:Reference")
public class DsReference {

    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "URI")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String uri;
    @XmlAttribute(name = "Type")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String type;
    @XmlElement(name = "ds:Transforms")
    protected DsTransforms dsTransforms;
    @XmlElement(name = "ds:DigestMethod", required = true)
    protected DsDigestMethod dsDigestMethod;
    @XmlElement(name = "ds:DigestValue", required = true)
    protected String dsDigestValue;

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
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURI() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURI(String value) {
        this.uri = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the dsTransforms property.
     * 
     * @return
     *     possible object is
     *     {@link DsTransforms }
     *     
     */
    public DsTransforms getDsTransforms() {
        return dsTransforms;
    }

    /**
     * Sets the value of the dsTransforms property.
     * 
     * @param value
     *     allowed object is
     *     {@link DsTransforms }
     *     
     */
    public void setDsTransforms(DsTransforms value) {
        this.dsTransforms = value;
    }

    /**
     * Gets the value of the dsDigestMethod property.
     * 
     * @return
     *     possible object is
     *     {@link DsDigestMethod }
     *     
     */
    public DsDigestMethod getDsDigestMethod() {
        return dsDigestMethod;
    }

    /**
     * Sets the value of the dsDigestMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DsDigestMethod }
     *     
     */
    public void setDsDigestMethod(DsDigestMethod value) {
        this.dsDigestMethod = value;
    }

    /**
     * Gets the value of the dsDigestValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsDigestValue() {
        return dsDigestValue;
    }

    /**
     * Sets the value of the dsDigestValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsDigestValue(String value) {
        this.dsDigestValue = value;
    }

}
