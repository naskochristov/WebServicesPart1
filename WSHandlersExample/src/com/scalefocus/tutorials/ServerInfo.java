package com.scalefocus.tutorials;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace="http://tutorials.scalefocus.com")
@HandlerChain(file="handler-chain.xml")
public class ServerInfo{

	@WebMethod
	public String getServerName() {
		
		return "tutorials server";
		
	}

}