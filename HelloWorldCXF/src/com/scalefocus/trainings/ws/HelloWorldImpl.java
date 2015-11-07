package com.scalefocus.trainings.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.apache.cxf.interceptor.InInterceptors;
import org.apache.cxf.interceptor.OutInterceptors;



@WebService(name="SayHi",targetNamespace="http://tutorial.scalefocus.com",portName="SayHiModifiedPort",serviceName="SayHiModifiedService")
@InInterceptors(interceptors = "org.apache.cxf.interceptor.LoggingInInterceptor")
@OutInterceptors(interceptors = "org.apache.cxf.interceptor.LoggingOutInterceptor")
@SOAPBinding(style=Style.RPC)
public class HelloWorldImpl {
	
	@WebMethod(action="sayHiModifiedAction", operationName="sayHiModifiedOperation")
	@WebResult(partName="sayHiPartOut",name="textOut")
	public String sayHello(@WebParam(partName="sayHiPartIn",name="sayHiIn") SayHiInput input) {
		String result = input.getGreeting() + " " + input.getName() + " my friend!";
	//	System.out.println(result);
		return result;
	}

}
