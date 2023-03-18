package com.edu.test;

import com.edu.child.Manager;
import com.edu.child.Secretery;
import com.edu.parent.Employee;
import com.edu.util.MyDate;

/*
 * HeteroGenous collection
 */



public class PolymorphismTest2 {

	public static void main(String[] args) {
		
		Employee[] emps = {
				 new Manager("정우성", new MyDate(1980,3,3), 685200, "기획부", 2350),
				 new Secretery("문동은", new MyDate(1982,12,3), 20200, "재정부", 2350, "James"),
				 new Manager("정우성111", new MyDate(1980,3,3), 685200, "기ssss획부", 2350),
				 new Secretery("문동은1111", new MyDate(1982,12,3), 80000, "재정sss부", 2350, "Jssssames"),
		};
		
		
		//Manager는 홍보부, Secretery는 상사의 Jssssames
		for(Employee e : emps) {
			if(e instanceof Manager) {
			    ((Manager) e).changedept("홍보부");
				System.out.println(e.getDatails());
			}
			if(e instanceof Secretery) {
				System.out.println("Secretery 정보 출력");
				System.out.println(e.getDatails());
				int aSalary = ((Secretery) e).getAnnualSalary();
				System.out.println(aSalary + "만원");
			}
		}

	}

}
