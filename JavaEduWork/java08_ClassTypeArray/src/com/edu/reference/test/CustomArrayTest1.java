package com.edu.reference.test;
/*
 * 배열을 사용해서 여러명의 고객을 하나의 배열 객체에 저장
 * reference 데이터타입의 배열 선언, 생성, 초기화
 * */

// Customer의 정보를 저장하는 클래스(=vo 클래스)
// 필드 선언 --> 주입통로 --> 주입된 값을 받는 기능 encapsulation기법으로 작성
class Customer {
	private int ssn;
	private String custName;
	private String address;
	
	public Customer(int ssn, String custName, String address) {
		this.ssn = ssn;
		this.custName = custName;
		this.address = address;
	}
	
	public Customer() {}

	public int getSsn() {
		return ssn;
	}

	public String getCustName() {
		return custName;
	}

	public String getAddress() {
		return address;
	}
	
	//
	public String getDatails() {
		return ssn+","+custName+","+address;
	}
}



public class CustomArrayTest1 {

	public static void main(String[] args) {
		//1. 배열 선언과 생성을 동시에
		Customer[] customers = new Customer[3];
		
		
		customers[0] = new Customer(111, "James", "NY");
	    customers[1] = new Customer(222, "jk", "NYdd");
	    customers[2] = new Customer(333, "sdddd", "NYdddd");
	    
	    for(Customer c: customers) System.out.println(c);
	}

}
