package com.soapService.services;

import javax.xml.ws.Endpoint;

import com.soapService.beans.Products;
import com.soapService.business.ProductService;

public class MyEndpoint {

	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:1234/MyService", new ProductService());

	}

}
