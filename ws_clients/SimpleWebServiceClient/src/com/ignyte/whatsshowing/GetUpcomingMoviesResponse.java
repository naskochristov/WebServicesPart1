
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
 *         &lt;element name="GetUpcomingMoviesResult" type="{http://www.ignyte.com/whatsshowing}ArrayOfUpcomingMovie" minOccurs="0"/&gt;
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
    "getUpcomingMoviesResult"
})
@XmlRootElement(name = "GetUpcomingMoviesResponse")
public class GetUpcomingMoviesResponse {

    @XmlElement(name = "GetUpcomingMoviesResult")
    protected ArrayOfUpcomingMovie getUpcomingMoviesResult;

    /**
     * Gets the value of the getUpcomingMoviesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUpcomingMovie }
     *     
     */
    public ArrayOfUpcomingMovie getGetUpcomingMoviesResult() {
        return getUpcomingMoviesResult;
    }

    /**
     * Sets the value of the getUpcomingMoviesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUpcomingMovie }
     *     
     */
    public void setGetUpcomingMoviesResult(ArrayOfUpcomingMovie value) {
        this.getUpcomingMoviesResult = value;
    }

}
