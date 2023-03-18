package com.edu.test;

import com.edu.child.Manager;
import com.edu.child.Secretery;
import com.edu.parent.Employee;
import com.edu.util.MyDate;

/*
 * 1. m.getDetails(); --> 자식의 메소드가 동작해서 결과 출력 -> Virtual Method Invocation 원리가 동작
 * 
 *  Virtual Method Invocation
 *  1. compile 시점의  메소드 - Employee의 getDatails 호출
 *  2. runtime 시점의 메소드 - Manager의 getDatails 호출
 */



public class PolymorphismTest1 {

	public static void main(String[] args) {
		
		Employee m = new Manager("정우성", new MyDate(1980,3,3), 685200, "기획부", 2350);
		Employee s = new Secretery("문동은", new MyDate(1982,12,3), 20200, "재정부", 2350, "James");
		
		
		((Manager) m).changedept("개발부");
		
		//object casting
//		Manager manager = (Manager)m;
//		manager.changedept("개발부");
		
		int aSalary = ((Secretery) s).getAnnualSalary();
		
		Secretery secretery = (Secretery)s;
		secretery.Changebossname("어쩌구");
				
		System.out.println(m.getDatails());
		System.out.println(s.getDatails());
		
		
		

	}

}
