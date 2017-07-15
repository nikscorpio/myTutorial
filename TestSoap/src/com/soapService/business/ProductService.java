package com.soapService.business;

import java.util.List;

import javax.jws.WebService;

import com.soapService.Impl.ProductImpl;
import com.soapService.beans.Products;
import com.soapService.services.I_MySampleSoap;


@WebService(endpointInterface = "com.soapService.services.I_MySampleSoap",
portName="MyService", 
serviceName="MyProductService", targetNamespace="http://www.mySchema.com")
public class ProductService implements I_MySampleSoap {

	ProductImpl impl = new ProductImpl();
	
	@Override
	public List<Products> getProducts( ) {
		// TODO Auto-generated method stub
		return impl.getProducts();
	}
	
	public Integer sum (int a, int b) {
		return a+b;
	}

}
