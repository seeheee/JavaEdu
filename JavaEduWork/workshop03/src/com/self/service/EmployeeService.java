package com.self.service;

import com.self.util.MyDate;
import com.self.vo.Employee;
import com.self.vo.Engineer;
import com.self.vo.Manager;

public class EmployeeService {
//	Manager[ ] ms;
//	int midx;
//	
//	Engineer[ ] egs;
//	int egidx;	
	
	Employee[] employees;
	int idx = 0;

	private EmployeeService(int size){
//		ms = new Manager[size];
//		egs = new Engineer[size];
		employees = new Employee[size];
	}
	
//	e = new Manager("AAA", new MyDate(1978, 1, 1), 20000.0, "개발부", 10)
	
	public void addEmployee(Employee e) {
//		if(e instanceof Manager) { // 확인 필요없음!! 부모는 무조건 자식한테 자동으로 들어감
//			((Manager) e).setName(e[0]);
			
			employees[idx++] = e;
			
//		}
//		else if(e instanceof Engineer) {
//			employees[idx++] = e;
//		}
	}
	
	public void deleteEmployee(String name) {
		for(int i=0; i<midx; i++) {
			if(((Manager) ms[i]).getName().equals(name)) {
				for(int j=i; j<midx; j++) {
					ms[j] = ms[j+1];
				}
				ms[midx] = null;
				midx--;
			}
		}
	}
	
//	
//	public void deleteManager(String name) {	
//		
//	}
//	public void deleteEngineer(String name) {
//		for(int i=0; i<egidx; i++) {
//			if(egs[i].getName().equals(name)) {
//				for(int j=i; j<egidx; j++) {
//					egs[j] = egs[j+1];
//				}
//				egs[egidx] = null;
//				egidx--;
//			}
//		}
//	}
	

	
	
	public void updateByManager(double salary, String dept, int deptno, String name) {	
		for(Manager manager : ms) {	
			if(manager==null) continue;
			if(manager.getName().equals(name)) {
				manager.setSalary(salary);
				manager.setDept(dept);	
				manager.setDeptno(deptno);				
			}			
		}
	}
	
	public void updateByEngineer(double salary, String dept, String name, String tech, double bonus) {	
		for(Engineer engineer : egs) {	
			if(engineer==null) continue;
			if(engineer.getName().equals(name)) {
				engineer.setSalary(salary);
				engineer.setTech(tech);	
				engineer.setBonus(bonus);				
			}			
		}
	}	
	
	
	//Method Overloading
	/*
	 * 하는일은 똑같은데...처리하는 데이타를 달리할때 쓰는 기법
	 * 메소드의 통일감을 강조하면서도 서로다른 데이타를 처리할수 있게끔 해준다.
	 */
	public Manager find(String name) {
		Manager m = null;
		for(Manager manager : ms) {
			if(manager==null) continue;			
			if(manager.getName().equals(name))
				m = manager;
		}
		return m;
	}
	
	public Manager[ ] findManager(int deptno) {
		Manager[ ] temp = new Manager[ms.length];
		int idx = 0;
		for (Manager manager : ms) {
			if(manager==null) continue;
			if(manager.getDeptno() == deptno) {
				temp[idx++] = manager; 
			}
		}
		return temp;
	}
	
	public Engineer findEngineer(String name) {
		Engineer eg = null;
		for(Engineer engineer : egs) {
			if(engineer==null) continue;
			if(engineer.getName().equals(name)) {
				eg = engineer;
			}
		}
		return eg;
	}	
	//추가
	public void printManagers() {		
		for(Manager m : ms) {
			if(m!=null)
			System.out.println(m.toString());
		}
	}
	public void printEngineers() {
		for(Engineer e : egs) {
			if(e!=null)
			System.out.println(e.toString());
		}
	}
}

