package com.edu.vo;


//아울렛에서 상품을 구매하는 고객에 관련된 정보를 저장
public class Customer {
	private int ssn;
	private String name;
	private String address;
	
	private Product[] products;

	public Customer(int ssn, String name, String address) {
		this.ssn = ssn;
		this.name = name;
		this.address = address;
	}

	
	public Product[] getProducts() {
		return products;
	}

	public void buyProducts(Product[] products) {
		this.products = products;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void changeAddress(String address) {
		this.address = address;
	}

	public int getSsn() {
		return ssn;
	}
	
	

}
