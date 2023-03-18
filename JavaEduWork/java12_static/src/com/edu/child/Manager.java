package com.edu.child;

import com.edu.parent.Employee;
import com.edu.util.MyDate;

public class Manager extends Employee {
	private String dept;
	private int bouns;
	
	public Manager(String name, MyDate birthdate, double salary, String address, String dept, int bouns) {
		super(name, birthdate, salary, address);
		this.dept = dept;
		this.bouns = bouns;
	}

	public void changedept(String dept) {
		this.dept = dept;
	}

	
	public int getAnnualSalary() {
		return (int)(getSalary() * 12) + bouns;
	}
	
	
	@Override
	public String getDatails() {
		return super.getDatails() + "," + dept + "," + bouns;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getBouns() {
		return bouns;
	}

	public void setBouns(int bouns) {
		this.bouns = bouns;
	}
	
	
	
}
