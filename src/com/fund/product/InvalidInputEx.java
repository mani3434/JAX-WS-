package com.fund.product;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class InvalidInputEx extends Exception {

	private String reason;
	
	public InvalidInputEx(String response, String reason) {
		super(response);
		this.reason = reason;
	}
	
	
	public String getReason() 
	{
		return this.reason;
	}
}
