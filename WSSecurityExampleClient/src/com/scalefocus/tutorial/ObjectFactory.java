
package com.scalefocus.tutorial;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.scalefocus.tutorial. package. 
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

    private final static QName _Greeting_QNAME = new QName("http://tutorial.scalefocus.com", "Greeting");
    private final static QName _SayHiSecureOperation_QNAME = new QName("http://tutorial.scalefocus.com", "sayHiSecureOperation");
    private final static QName _SayHiSecureOperationResponse_QNAME = new QName("http://tutorial.scalefocus.com", "sayHiSecureOperationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.scalefocus.tutorial.
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GreetingType }
     * 
     */
    public GreetingType createGreetingType() {
        return new GreetingType();
    }

    /**
     * Create an instance of {@link SayHiSecureOperation }
     * 
     */
    public SayHiSecureOperation createSayHiSecureOperation() {
        return new SayHiSecureOperation();
    }

    /**
     * Create an instance of {@link SayHiSecureOperationResponse }
     * 
     */
    public SayHiSecureOperationResponse createSayHiSecureOperationResponse() {
        return new SayHiSecureOperationResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GreetingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tutorial.scalefocus.com", name = "Greeting")
    public JAXBElement<GreetingType> createGreeting(GreetingType value) {
        return new JAXBElement<GreetingType>(_Greeting_QNAME, GreetingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHiSecureOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tutorial.scalefocus.com", name = "sayHiSecureOperation")
    public JAXBElement<SayHiSecureOperation> createSayHiSecureOperation(SayHiSecureOperation value) {
        return new JAXBElement<SayHiSecureOperation>(_SayHiSecureOperation_QNAME, SayHiSecureOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHiSecureOperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tutorial.scalefocus.com", name = "sayHiSecureOperationResponse")
    public JAXBElement<SayHiSecureOperationResponse> createSayHiSecureOperationResponse(SayHiSecureOperationResponse value) {
        return new JAXBElement<SayHiSecureOperationResponse>(_SayHiSecureOperationResponse_QNAME, SayHiSecureOperationResponse.class, null, value);
    }

}
