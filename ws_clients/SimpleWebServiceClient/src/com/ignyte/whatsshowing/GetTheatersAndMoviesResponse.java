
package com.ignyte.whatsshowing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetTheatersAndMoviesResult" type="{http://www.ignyte.com/whatsshowing}ArrayOfTheater" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getTheatersAndMoviesResult"
})
@XmlRootElement(name = "GetTheatersAndMoviesResponse")
public class GetTheatersAndMoviesResponse {

    @XmlElement(name = "GetTheatersAndMoviesResult")
    protected ArrayOfTheater getTheatersAndMoviesResult;

    /**
     * Gets the value of the getTheatersAndMoviesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTheater }
     *     
     */
    public ArrayOfTheater getGetTheatersAndMoviesResult() {
        return getTheatersAndMoviesResult;
    }

    /**
     * Sets the value of the getTheatersAndMoviesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTheater }
     *     
     */
    public void setGetTheatersAndMoviesResult(ArrayOfTheater value) {
        this.getTheatersAndMoviesResult = value;
    }

}
