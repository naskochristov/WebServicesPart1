
package com.ignyte.whatsshowing;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUpcomingMovie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUpcomingMovie"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UpcomingMovie" type="{http://www.ignyte.com/whatsshowing}UpcomingMovie" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUpcomingMovie", propOrder = {
    "upcomingMovie"
})
public class ArrayOfUpcomingMovie {

    @XmlElement(name = "UpcomingMovie", nillable = true)
    protected List<UpcomingMovie> upcomingMovie;

    /**
     * Gets the value of the upcomingMovie property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the upcomingMovie property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpcomingMovie().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpcomingMovie }
     * 
     * 
     */
    public List<UpcomingMovie> getUpcomingMovie() {
        if (upcomingMovie == null) {
            upcomingMovie = new ArrayList<UpcomingMovie>();
        }
        return this.upcomingMovie;
    }

}
