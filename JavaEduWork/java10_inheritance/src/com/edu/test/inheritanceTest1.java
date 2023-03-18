package com.edu.test;

import com.edu.child.Manager;
import com.edu.parent.Employee;
import com.edu.util.MyDate;

public class inheritanceTest1 {

	public static void main(String[] args) {
		Employee e = new Employee("이정재", new MyDate(1998,1,1), 23000000);
		
		//매개변수 뒤엔 toString이 항상 생략되어있음(object 상속받았기 때문)
		System.out.println(e);
		System.out.println(e.toString());
		
		
		Manager m = new Manager("정우성", new MyDate(1980,3,3), 685200, "기획부", 2350);
		
		
		Employee[] emps = {
			   m,
			   e,	
		};
		
		for(Employee emp : emps)
			System.out.println(emp.getDatails());
		
		

	}

}
