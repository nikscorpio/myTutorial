package com.soapService.beans;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement (name="MyBean")
@XmlType
public class Products {
	
	public Products() {
		
	}
	
	
	private String productCatagery;
	
	private String productType;
	@XmlElement(defaultValue="computer", nillable=false, required=true)
	public String getProductCatagery() {
		return productCatagery;
	}
	public void setProductCatagery(String productCatagery) {
		this.productCatagery = productCatagery;
	}
	@XmlElement(required=false)
	public String getProductID() {
		return productType;
	}
	public void setProductID(String productID) {
		this.productType = productID;
	}
	public Products(String productCatagery, String productID) {
		this.productCatagery = productCatagery;
		this.productType = productID;
	}
	
	
	

}
