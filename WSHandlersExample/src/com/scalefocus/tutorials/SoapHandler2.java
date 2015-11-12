package com.scalefocus.tutorials;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import javax.xml.soap.Node;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFault;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import javax.xml.ws.soap.SOAPFaultException;

public class SoapHandler2 implements SOAPHandler<SOAPMessageContext>{

   @Override
   public boolean handleMessage(SOAPMessageContext context) {

	System.out.println("SOAPHandler2 : handleMessage() start");
	Boolean isResponse = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

	//for response message only, true for outbound messages, false for inbound
	if(!isResponse){
		System.out.println("SOAPHandler2 on Request.");
		try {
			context.getMessage().writeTo(System.out);
			
		} catch (SOAPException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
	else
	{
		System.out.println("SOAPHandler2 on Response.");
	}
	
	  	//continue other handler chain
		System.out.println("SOAPHandler2 : handleMessage() end");
		return false;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		
		System.out.println("SOAPHandler2 : handleFault()......");
		
		return true;
	}

	@Override
	public void close(MessageContext context) {
		System.out.println("SOAPHandler2 : close()......");
	}

	@Override
	public Set<QName> getHeaders() {
		System.out.println("SOAPHandler2 : getHeaders()......");
		return null;
	}
	
     private void generateSOAPErrMessage(SOAPMessage msg, String reason) {
       try {
          SOAPBody soapBody = msg.getSOAPPart().getEnvelope().getBody();
          SOAPFault soapFault = soapBody.addFault();
          soapFault.setFaultString(reason);
          throw new SOAPFaultException(soapFault); 
       }
       catch(SOAPException e) { }
    }

}