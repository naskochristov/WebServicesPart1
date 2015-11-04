
package net.webservicex.goldsilver;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LondonMarketData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LondonMarketData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Gold_AM_USD" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Gold_AM_STG" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Gold_AM_EUR" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Gold_PM_USD" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Gold_PM_STG" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Gold_PM_EUR" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Silver_CENTS" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Silver_PENCE" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Silver_EUR" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlRootElement(name="londonMarketData")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LondonMarketData", propOrder = {
    "goldAMUSD",
    "goldAMSTG",
    "goldAMEUR",
    "goldPMUSD",
    "goldPMSTG",
    "goldPMEUR",
    "silverCENTS",
    "silverPENCE",
    "silverEUR",
    "status"
})
public class LondonMarketData {

    @XmlElement(name = "Gold_AM_USD")
    protected float goldAMUSD;
    @XmlElement(name = "Gold_AM_STG")
    protected float goldAMSTG;
    @XmlElement(name = "Gold_AM_EUR")
    protected float goldAMEUR;
    @XmlElement(name = "Gold_PM_USD")
    protected float goldPMUSD;
    @XmlElement(name = "Gold_PM_STG")
    protected float goldPMSTG;
    @XmlElement(name = "Gold_PM_EUR")
    protected float goldPMEUR;
    @XmlElement(name = "Silver_CENTS")
    protected float silverCENTS;
    @XmlElement(name = "Silver_PENCE")
    protected float silverPENCE;
    @XmlElement(name = "Silver_EUR")
    protected float silverEUR;
    @XmlElement(name = "Status")
    protected String status;

    /**
     * Gets the value of the goldAMUSD property.
     * 
     */
    public float getGoldAMUSD() {
        return goldAMUSD;
    }

    /**
     * Sets the value of the goldAMUSD property.
     * 
     */
    public void setGoldAMUSD(float value) {
        this.goldAMUSD = value;
    }

    /**
     * Gets the value of the goldAMSTG property.
     * 
     */
    public float getGoldAMSTG() {
        return goldAMSTG;
    }

    /**
     * Sets the value of the goldAMSTG property.
     * 
     */
    public void setGoldAMSTG(float value) {
        this.goldAMSTG = value;
    }

    /**
     * Gets the value of the goldAMEUR property.
     * 
     */
    public float getGoldAMEUR() {
        return goldAMEUR;
    }

    /**
     * Sets the value of the goldAMEUR property.
     * 
     */
    public void setGoldAMEUR(float value) {
        this.goldAMEUR = value;
    }

    /**
     * Gets the value of the goldPMUSD property.
     * 
     */
    public float getGoldPMUSD() {
        return goldPMUSD;
    }

    /**
     * Sets the value of the goldPMUSD property.
     * 
     */
    public void setGoldPMUSD(float value) {
        this.goldPMUSD = value;
    }

    /**
     * Gets the value of the goldPMSTG property.
     * 
     */
    public float getGoldPMSTG() {
        return goldPMSTG;
    }

    /**
     * Sets the value of the goldPMSTG property.
     * 
     */
    public void setGoldPMSTG(float value) {
        this.goldPMSTG = value;
    }

    /**
     * Gets the value of the goldPMEUR property.
     * 
     */
    public float getGoldPMEUR() {
        return goldPMEUR;
    }

    /**
     * Sets the value of the goldPMEUR property.
     * 
     */
    public void setGoldPMEUR(float value) {
        this.goldPMEUR = value;
    }

    /**
     * Gets the value of the silverCENTS property.
     * 
     */
    public float getSilverCENTS() {
        return silverCENTS;
    }

    /**
     * Sets the value of the silverCENTS property.
     * 
     */
    public void setSilverCENTS(float value) {
        this.silverCENTS = value;
    }

    /**
     * Gets the value of the silverPENCE property.
     * 
     */
    public float getSilverPENCE() {
        return silverPENCE;
    }

    /**
     * Sets the value of the silverPENCE property.
     * 
     */
    public void setSilverPENCE(float value) {
        this.silverPENCE = value;
    }

    /**
     * Gets the value of the silverEUR property.
     * 
     */
    public float getSilverEUR() {
        return silverEUR;
    }

    /**
     * Sets the value of the silverEUR property.
     * 
     */
    public void setSilverEUR(float value) {
        this.silverEUR = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
