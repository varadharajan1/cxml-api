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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "xadesOtherValue"
})
@XmlRootElement(name = "xades:OtherValues")
public class XadesOtherValues {

    @XmlElement(name = "xades:OtherValue", required = true)
    protected List<XadesOtherValue> xadesOtherValue;

    /**
     * Gets the value of the xadesOtherValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xadesOtherValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXadesOtherValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XadesOtherValue }
     * 
     * 
     */
    public List<XadesOtherValue> getXadesOtherValue() {
        if (xadesOtherValue == null) {
            xadesOtherValue = new ArrayList<XadesOtherValue>();
        }
        return this.xadesOtherValue;
    }

}
