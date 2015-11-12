package com.scalefocus.trainings.ws;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="Greeting")
@XmlType(name="GreetingType", namespace="http://tutorial.scalefocus.com" , propOrder={"name", "greeting"} )
public class SayHiInput {

	
	private String greeting;

	private String name;
	
	public SayHiInput()
	{
		super();
	}
	public SayHiInput(String aGreeting, String aName)
	{
		greeting = aGreeting;
		name = aName;
	}
	
	@XmlElement(name="greetingElem")
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	@XmlElement(name="nameElem")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
