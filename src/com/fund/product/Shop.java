package com.fund.product;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.DOCUMENT)
public class Shop {

	@WebMethod
	@WebResult(name="output")
	public String getMatch(@WebParam(name ="input") String s) throws InvalidInputEx {
		
		String r = null;
		if(s.equals("mani")) {
			r= "mani";
		}
		else if(s.equals("jaga")) {
			r= "jaga";
		}
		else {
			throw new InvalidInputEx("Input error", s +" is not a valid input");
		}
		return r;
	}
}
