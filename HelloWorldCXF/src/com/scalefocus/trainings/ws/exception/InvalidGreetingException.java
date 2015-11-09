package com.scalefocus.trainings.ws.exception;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.ws.WebFault;

@WebFault(messageName="InvalidGreetingFault",name="InvalidGreetingFaultType", targetNamespace="http://trainings.scalefocus.com")
public class InvalidGreetingException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7278301084483158744L;
	
	private int exceptionCode;
	private String exceptionMessage;
	
	public InvalidGreetingException(int code, String message) {
		
		exceptionCode = code;
		exceptionMessage = message;
	}
	
	@XmlElement(name="code")
	public int getExceptionCode() {
		return exceptionCode;
	}
	public void setExceptionCode(int exceptionCode) {
		this.exceptionCode = exceptionCode;
	}
	@XmlElement(name="message")
	public String getExceptionMessage() {
		return exceptionMessage;
	}
	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}
	
	

}
