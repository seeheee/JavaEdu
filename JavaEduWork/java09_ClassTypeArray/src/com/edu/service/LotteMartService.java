package com.edu.service;

import com.edu.vo.Customer;
import com.edu.vo.Product;

public class LotteMartService {
	
	
	//1. 특정 고객이 구입한 상품을 리턴
	public Product[] getProducts(Customer cust) {
		return cust.getProducts();
	}
	
	
    //2. 
	public String[] getAllProductMaker(Customer cust) {
		String[ ] temp = new String[cust.getProducts().length];
		for(Product p : temp)
			temp = cust.buyProducts(p);
	    return temp;
	}
	
	public Customer findCustomer(Customer[] custs, int ssn) {
		Customer customer = null;
	    for(Customer c : custs) {
	     	if(c == null) continue;
	    	if(c.getSsn() == ssn)
	    		customer = c;
	    }
		return customer;
	}
	
	public Customer findCustomer(Customer[] custs, String address) {
		Customer customer = null;
	    for(Customer c : custs) {
	     	if(c == null) continue;
	    	if(c.getAddress().equals(address))
	    		customer = c;
	    }
		return customer;
	}

}
