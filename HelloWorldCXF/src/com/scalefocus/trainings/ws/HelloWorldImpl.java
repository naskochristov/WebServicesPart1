package com.scalefocus.trainings.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.WebFault;

import org.apache.cxf.interceptor.InInterceptors;
import org.apache.cxf.interceptor.OutInterceptors;

import com.scalefocus.trainings.ws.exception.InvalidGreetingException;



@WebService(name="SayHi",targetNamespace="http://tutorial.scalefocus.com",portName="SayHiModifiedPort",serviceName="SayHiModifiedService")
@InInterceptors(interceptors = "org.apache.cxf.interceptor.LoggingInInterceptor")
@OutInterceptors(interceptors = "org.apache.cxf.interceptor.LoggingOutInterceptor")
@SOAPBinding(style=Style.DOCUMENT)
public class HelloWorldImpl 
{
	
	@WebMethod(action="sayHiModifiedAction", operationName="sayHiModifiedOperation")
	@WebResult(partName="sayHiPartOut",name="textOut")
	public String sayHello(SayHiInput input) 
			throws InvalidGreetingException 
	
	{
		String greeting = input.getGreeting();
		String name = input.getName();
		if(greeting == null || "".equals(greeting) || greeting.startsWith("F"))
			throw new InvalidGreetingException(999,"Your greeting is not acceptable!!");
		String result = input.getGreeting() + " " + input.getName() + " , my friend!";
		//String result = "Hello" + input + " , my friend!";
		//	System.out.println(result);
		return result;
	}

}
