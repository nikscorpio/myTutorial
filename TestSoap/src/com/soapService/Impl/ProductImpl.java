package com.soapService.Impl;

import java.util.ArrayList;
import java.util.List;

import com.soapService.beans.Products;

public class ProductImpl {
	 private List<Products> computers = new ArrayList<Products>();
	 
	 private List<Products> stationary = new ArrayList<Products>();
	 
	 private List<Products> general = new ArrayList<Products>();
	
	public ProductImpl() {
		
		
		computers.add(new Products("Computer", "Laptop") );
		computers.add(new Products("Computer", "PC") );
		computers.add(new Products("Computer", "Tablet") );
		
		stationary.add(new Products("stationary", "pen") );
		stationary.add(new Products("stationary", "pencil") );
		stationary.add(new Products("stationary", "paper") );
		
		general.add(new Products("general", "cloths") );
		general.add(new Products("general", "shoes") );
		general.add(new Products("general", "eatables") );
		
		
	}
	
	
	
	public List<Products> getProducts() {
		// TODO Auto-generated method stub
		return computers ;
	}


}
