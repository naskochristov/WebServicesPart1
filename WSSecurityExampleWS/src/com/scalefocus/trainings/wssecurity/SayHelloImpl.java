package com.scalefocus.trainings.wssecurity;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.apache.cxf.interceptor.InInterceptors;
import org.apache.cxf.interceptor.OutInterceptors;

@WebService(name="SayHiSecure",targetNamespace="http://tutorial.scalefocus.com",portName="SayHiSecurePort",serviceName="SayHiSecureService")
@InInterceptors(interceptors = "org.apache.cxf.interceptor.LoggingInInterceptor")
@OutInterceptors(interceptors = "org.apache.cxf.interceptor.LoggingOutInterceptor")
@SOAPBinding(style=Style.DOCUMENT)
public class SayHelloImpl 
{
	
	@WebMethod(action="sayHiSecureAction", operationName="sayHiSecureOperation")
	@WebResult(partName="sayHiSecurePartOut",name="textOut")
	public String sayHello(@WebParam(name="sayHiSecurePartIn") SayHiInput input) 
	{
		String greeting = input.getGreeting();
		String name = input.getName();
		String result = greeting + " ," + name + " , my friend!";
		System.out.println(result);
		return result;
	}

}