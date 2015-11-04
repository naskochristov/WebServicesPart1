
package net.webservicex.goldsilver;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.webservicex.goldsilver package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LondonMarketData_QNAME = new QName("http://www.webservicex.net", "LondonMarketData");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.webservicex.goldsilver
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetLondonGoldAndSilverFix }
     * 
     */
    public GetLondonGoldAndSilverFix createGetLondonGoldAndSilverFix() {
        return new GetLondonGoldAndSilverFix();
    }

    /**
     * Create an instance of {@link GetLondonGoldAndSilverFixResponse }
     * 
     */
    public GetLondonGoldAndSilverFixResponse createGetLondonGoldAndSilverFixResponse() {
        return new GetLondonGoldAndSilverFixResponse();
    }

    /**
     * Create an instance of {@link LondonMarketData }
     * 
     */
    public LondonMarketData createLondonMarketData() {
        return new LondonMarketData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LondonMarketData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webservicex.net", name = "LondonMarketData")
    public JAXBElement<LondonMarketData> createLondonMarketData(LondonMarketData value) {
        return new JAXBElement<LondonMarketData>(_LondonMarketData_QNAME, LondonMarketData.class, null, value);
    }

}
