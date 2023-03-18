package com.edu.parent;

import com.edu.util.MyDate;

public class Employee {
	private String name;
	private MyDate birthdate;
	private double salary;
	private String address;
	
	//기본값 지정(상수값)
	public static final double BASIC_SALARY = 300;
	public static final String BASIC_NAME = "홍길동";
	
	
//	public Employee() {}
	
	public Employee(String name, MyDate birthdate, double salary, String address) {
		super();
		this.name = name;
		this.birthdate = birthdate;
		this.salary = salary;
		this.address = address;
	}
	
	/*
	 * this 키워드
	 * 객체 자신의 주소값을 가지고 있는 키워드
	 * 해당 클래스의 자기자신을 가리킨다.
	 * 
	 * 1} local V, feild 이름이 동일할때 feild 앞에 붙임
	 * 2) 생성자 앞 사용 : 하나의 클래스에서 또다른 생성자 호출
	 * 
	 */
	
	public Employee(String name, MyDate birthdate) {
		this(name, birthdate, BASIC_SALARY, ""); //또 다른 생성자 호출
	}
	
	public Employee(MyDate birthdate, double salary) {
		this(BASIC_NAME, birthdate, salary, ""); 
	}
	
	public String getDatails() {
		return name + "-" + birthdate + "-" + salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(MyDate birthdate) {
		this.birthdate = birthdate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
