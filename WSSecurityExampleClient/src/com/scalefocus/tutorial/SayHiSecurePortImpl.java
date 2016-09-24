package com.scalefocus.tutorial;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.3
 * 2015-11-15T18:11:46.392+01:00
 * Generated source version: 3.1.3
 * 
 */

@WebService(
                      serviceName = "SayHiSecureService",
                      portName = "SayHiSecurePort",
                      targetNamespace = "http://tutorial.scalefocus.com",
                      wsdlLocation = "http://localhost:8880/WSSecurityExampleWS/services/SayHiSecurePort?wsdl",
                      endpointInterface = "com.scalefocus.tutorial..SayHiSecure")
                      
public class SayHiSecurePortImpl implements SayHiSecure {

    private static final Logger LOG = Logger.getLogger(SayHiSecurePortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.scalefocus.tutorial..SayHiSecure#sayHiSecureOperation(com.scalefocus.tutorial..GreetingType  sayHiSecurePartIn )*
     */
    public java.lang.String sayHiSecureOperation(com.scalefocus.tutorial.GreetingType sayHiSecurePartIn) { 
        LOG.info("Executing operation sayHiSecureOperation");
        System.out.println(sayHiSecurePartIn);
        try {
            java.lang.String _return = "_return-1009520310";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}