package com.edu.test;

import com.edu.child.Manager;
import com.edu.child.Secretery;
import com.edu.parent.Employee;
import com.edu.service.EmployeeService;
import com.edu.util.MyDate;


public class StaticExamTest5 {

	public static void main(String[] args) {
		Employee[] emps = {
				 new Manager("정우성", new MyDate(1980,3,3), 685200,"여의도", "기획부", 2350),
				 new Secretery("문동은", new MyDate(1982,12,3), 20200, "재정부","여의도", 2350, "James"),
				 new Manager("정우성111", new MyDate(1980,3,3), 685200, "여의도","기ssss획부", 2350),
				 new Secretery("문동은1111", new MyDate(1982,12,3), 80000,"여의도1" ,"재정sss부", 2350, "Jssssames"),
		};
		
		
//		EmployeeService service = new EmployeeService();
		
		EmployeeService service = EmployeeService.getInstance();
		Employee[] employee = service.findEmployeeNtAddr(emps, "여의도");
		for(Employee e : employee) {
			if(e==null) continue;
			System.out.println(e.getDatails());
		}
		
	}

}
