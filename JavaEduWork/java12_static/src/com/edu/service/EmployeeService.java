package com.edu.service;

import com.edu.child.Manager;
import com.edu.parent.Employee;

/*
 * 
 * EmployeeService 클래스의 기능들은
 * 클라이언트가 요청하는 각각의 서비스를 수행하는 것들이다.
 * 
 * 요청당 서비스 클래스가 매핑되는 것이 아니라
 * 요청당 서비스 클래스의 기능 하나가 완벽하게 매핑되는 구조이다.
 * 
 * 결론은 서비스 클래스는 아무리 요청이 많이 들어와도 무조건 하나만 서버상에서 생성되어지고
 * 그 하나의 객체안의 기능들이 요청을 처리하는 완벽한 단위가 된다.
 * 
 */


public class EmployeeService {
	
	private static EmployeeService service = new EmployeeService();
	
	private EmployeeService() {
		System.out.println("Service creating...Using Singletone Pattern...");
	}
	
	public static EmployeeService getInstance() {
		return service;
	}
	
	//1.특정한 Employee의 일년 연봉을 리턴하는 기능을 정의(선언 + 구현)
	public int getAuualSalary(Employee e) {
		int annualSalary = 0;
		
		annualSalary = (int)(e.getSalary() * 12);
		
		if(e instanceof Manager){
			
			annualSalary = (int)(((Manager) e).getSalary() * 12) + ((Manager) e).getBouns();
			System.out.println(annualSalary);
		}
		return annualSalary;
	}
	
	//2.모든사원의 연간 총 인건비를 리턴
	public int getTotalCost(Employee[] ea) {
		int totalCost = 0;
		for(Employee e : ea) {
			totalCost += getAuualSalary(e);
		}
		return totalCost;
	}
	
	//3. 특정한 가원 검색
	public Employee findEmployeeByName(Employee[] ea, String name) {
		Employee emp = null;
		for(Employee e : ea) {
			if(e.getName().equals(name)) {
				emp = e;
			}
		}
		return emp;
	}
	
	//4.동일한 주소에 거주하는 사원들을 검색
	public Employee[] findEmployeeNtAddr(Employee[] ea, String address) {
		Employee[] emp = new Employee[ea.length]; //배열은 꼭 만들어주어야함
		int idx = 0;
		for(Employee e : ea) {
			if(e.getAddress().equals(address)) {
				emp[idx++] = e;
			}
		}
		return emp;
	}

}
