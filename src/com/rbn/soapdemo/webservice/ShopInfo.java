package com.rbn.soapdemo.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.rbn.soapdemo.exception.InvalidInputException;

@WebService
@SOAPBinding(style = Style.RPC) // default is DOCUMENT (recommended coz
								// validation features can be added in DOCUMENT)
public class ShopInfo {

	@WebMethod
	@WebResult(partName = "lookupOutput")
	public String getShopInfo(@WebParam(partName = "lookupInput") String property) throws InvalidInputException {
		String response = "Invalid Property";
		if ("shopName".equals(property)) {
			response = "Mero Shop";
		} else if ("since".equals(property)) {
			response = "since 2017";
		}
		else{
			throw new InvalidInputException("Invalid Input" , property + " is not a valid input");
		}
		return response;
	}
}
