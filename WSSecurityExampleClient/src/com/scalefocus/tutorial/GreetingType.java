
package com.scalefocus.tutorial;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GreetingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GreetingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nameElem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="greetingElem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GreetingType", propOrder = {
    "nameElem",
    "greetingElem"
})
public class GreetingType {

    protected String nameElem;
    protected String greetingElem;

    /**
     * Gets the value of the nameElem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameElem() {
        return nameElem;
    }

    /**
     * Sets the value of the nameElem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameElem(String value) {
        this.nameElem = value;
    }

    /**
     * Gets the value of the greetingElem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGreetingElem() {
        return greetingElem;
    }

    /**
     * Sets the value of the greetingElem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGreetingElem(String value) {
        this.greetingElem = value;
    }

}
