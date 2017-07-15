package com.soapService.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.soapService.beans.Products;

@WebService(name="SoapService", targetNamespace="http://www.mySchema.com")
public interface I_MySampleSoap {
	
	@WebMethod
	public abstract List<Products> getProducts();
	

}
