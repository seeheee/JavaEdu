package com.edu.self;

public class Customer {
	public String custName;
	public String address;
	private Account[] accounts;
	
	public Customer(String custName, String address) {
		this.custName = custName;
		this.address = address;
	}
	
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Account[] getAccounts() {
		return accounts;
	}
	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}
	
	

}
