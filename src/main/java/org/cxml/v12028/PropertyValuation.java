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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "propertyReference",
    "valueGroup"
})
@XmlRootElement(name = "PropertyValuation")
public class PropertyValuation {

    @XmlElement(name = "PropertyReference")
    protected PropertyReference propertyReference;
    @XmlElement(name = "ValueGroup")
    protected List<ValueGroup> valueGroup;

    /**
     * Gets the value of the propertyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyReference }
     *     
     */
    public PropertyReference getPropertyReference() {
        return propertyReference;
    }

    /**
     * Sets the value of the propertyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyReference }
     *     
     */
    public void setPropertyReference(PropertyReference value) {
        this.propertyReference = value;
    }

    /**
     * Gets the value of the valueGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueGroup }
     * 
     * 
     */
    public List<ValueGroup> getValueGroup() {
        if (valueGroup == null) {
            valueGroup = new ArrayList<ValueGroup>();
        }
        return this.valueGroup;
    }

}
