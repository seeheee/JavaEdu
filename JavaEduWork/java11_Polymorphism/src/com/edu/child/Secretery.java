package com.edu.child;

import com.edu.parent.Employee;
import com.edu.util.MyDate;

public class Secretery extends Employee {
	private String dept;
	private int bouns;
	private String bossname;
	

	
	public Secretery(String name, MyDate birthdate, double salary, String dept, String address, int bouns, String bossname) {
		super(name, birthdate, salary, address);
		this.dept = dept;
		this.bouns = bouns;
		this.bossname = bossname;
	}

	public int getAnnualSalary() {
		return (int)(getSalary() * 12) + bouns;
	}
	
	
	public void Changebossname(String bossname) {
		this.bossname = bossname;
	}

	@Override
	public String getDatails() {
		return super.getDatails() + "," + dept + "," + bouns + "," + bossname;
	}
	
	
	
	
}
