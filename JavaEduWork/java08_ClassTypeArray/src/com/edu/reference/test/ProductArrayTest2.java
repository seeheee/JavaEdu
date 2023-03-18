package com.edu.reference.test;

class Product{
	private int productNo;
	private String brand;
	private int price;
	
	public Product(int productNo, String brand, int price) {
		this.productNo = productNo;
		this.brand = brand;
		this.price = price;
	}
	
	public Product() {}
	
	public int getProductNo() {
		return productNo;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	
	
	
}


public class ProductArrayTest2 {

	public static void main(String[] args) {
		//1. 
		Product[] products = {
				new Product(11, "초코파이", 2000),
				new Product(22, "댕기머리 샴푸", 24000),
				new Product(33, "삼성 티비", 5000000),
				new Product(44, "테라", 5000)
		};
		
		for(int i = 0; i < products.length; i++)
		{
				System.out.println(products[i]);
			}
		

	}

}
