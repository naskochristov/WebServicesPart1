package com.scalefocus.trainings.ws;

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
	
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
