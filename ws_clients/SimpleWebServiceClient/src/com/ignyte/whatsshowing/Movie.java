
package com.ignyte.whatsshowing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Movie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Movie"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RunningTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShowTimes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Movie", propOrder = {
    "rating",
    "name",
    "runningTime",
    "showTimes"
})
public class Movie {

    @XmlElement(name = "Rating")
    protected String rating;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "RunningTime")
    protected String runningTime;
    @XmlElement(name = "ShowTimes")
    protected String showTimes;

    /**
     * Gets the value of the rating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRating(String value) {
        this.rating = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the runningTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunningTime() {
        return runningTime;
    }

    /**
     * Sets the value of the runningTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunningTime(String value) {
        this.runningTime = value;
    }

    /**
     * Gets the value of the showTimes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowTimes() {
        return showTimes;
    }

    /**
     * Sets the value of the showTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowTimes(String value) {
        this.showTimes = value;
    }

}
