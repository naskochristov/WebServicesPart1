package com.scalefocus.tutorial;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sayHiSecureOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sayHiSecureOperation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sayHiSecurePartIn" type="{http://tutorial.scalefocus.com}GreetingType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sayHiSecureOperation", propOrder = {
    "sayHiSecurePartIn"
})
public class SayHiSecureOperation {

    protected GreetingType sayHiSecurePartIn;

    /**
     * Gets the value of the sayHiSecurePartIn property.
     * 
     * @return
     *     possible object is
     *     {@link GreetingType }
     *     
     */
    public GreetingType getSayHiSecurePartIn() {
        return sayHiSecurePartIn;
    }

    /**
     * Sets the value of the sayHiSecurePartIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link GreetingType }
     *     
     */
    public void setSayHiSecurePartIn(GreetingType value) {
        this.sayHiSecurePartIn = value;
    }

}
