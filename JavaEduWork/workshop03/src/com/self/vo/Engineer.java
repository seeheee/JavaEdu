package com.self.vo;

import com.self.util.MyDate;

public class Engineer extends Employee {
	private String tech;
	private double bonus;
	
	public Engineer(String name, MyDate birthDate, double salary, String tech, double bonus) {
		super(name, birthDate, salary);
		this.tech = tech;
		this.bonus = bonus;
	}	
//	public String getName() {
//		return name;
//	}	
//	public void setBirthDate(MyDate birthDate) {
//		this.birthDate = birthDate;
//	}
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}	
//	public double getSalary() {
//		return salary;
//	}
	public String getTech() {
		return tech;
	}
	public double getBonus() {
		return bonus;
	}
//	public MyDate getBirthDate() {
//		return birthDate;
//	}
	
	
	@Override
	public String toString() {
		return super.toString()+","+tech+","+bonus;
	}
	
	
		
}
