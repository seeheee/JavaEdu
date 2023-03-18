package com.edu.service.impl;

import java.util.ArrayList;

import com.edu.exception.DuplicateIDException01;
import com.edu.service.EmployeeListService;
import com.edu.vo.Employee;
import com.edu.vo.Engineer;
import com.edu.vo.Manager;

public class EmployeeListServiceImpl implements EmployeeListService{
	
	
	private ArrayList<Employee> list;
	
	private static EmployeeListServiceImpl service = new EmployeeListServiceImpl();
	
	private EmployeeListServiceImpl(){
		//리사이징이 가능
		list = new ArrayList<>();
	}
	
	
	public static EmployeeListServiceImpl getInstance() {
		return service;
	}
	
	@Override
	public void addEmployee(Employee e) throws DuplicateIDException01 {
		//있다면 추가안됨
		// 없다면 추가되도록
		boolean find = false;
		for(Employee emp : list) {
			if(emp.getEmpId().equals(e.getEmpId())) {
				find = true;
//				System.out.println(e.getName()+"님은 이미 직웝으로 등록된 상태입니다.");
//				return;
				throw new DuplicateIDException01("이미 직웝으로 등록된 상태입니다.");
				
			}
		}
		
		if(find==false) {
			list.add(e);
			System.out.println(e.getName()+"님은 직원으로 등록되었습니다.");
		}
		
		
//		int sizeOfArrayList = list.size();
//		
//		if (sizeOfArrayList == 0) {
//			list.add(e);
//			System.out.println(e.getName()+"님은 직원으로 등록되었습니다.");
//		}
//		else {
//			for(int i =0; i < sizeOfArrayList; i++) {
//				if(list.get(i).equals(e)) {
//					System.out.println("존재합니다");
//				}
//				else {
//					list.add(e);
//				}
//			}
//		}
	}

	@Override
	public void deleteEmployee(String empId) {
		// 삭제하려는 직원이있다면 삭제 진행
		// TODO Auto-generated method stub
		boolean find = false; 
		for(Employee e:list) {
			if(e.getEmpId().equals(empId)) {
				find = true;
				System.out.println(e.getName()+"님은 퇴사 처리되었습니다.");
				list.remove(e);
				break;
			}
		if(find==false) {System.out.println("직원이 없습니다.");}
	}
		
//		if(list.isEmpty()) {
//			System.out.println("직원이 없습니다.");
//		}else {
//			for(int i =0; i < list.size(); i++) {
//				if(list.get(i).equals(empId)) {
//					list.remove(i);
//					System.out.println("삭제완료");
//				}
//			}
//		}
	}

	@Override
	public void updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		boolean find = false; 
		for(Employee emp:list) {
			if(emp.getEmpId().equals(e.getEmpId())) {
				find = true;
				emp.setName(e.getName());
				emp.setAddr(e.getAddr());
				emp.setSalary(e.getSalary());
				if (emp instanceof Manager) {
					((Manager)emp).changeDept(((Manager)e).getDept());
				}else {
					((Engineer)emp).changeBonus(((Engineer)e).getBonus());
					((Engineer)emp).changeTech(((Engineer)e).getTech());
				}
			}
		}
		if(find==false) System.out.println("수정할 직원정보가 존재하지 않습니다.");
	}
	

	@Override
	public ArrayList<Employee> findEmployees(String addr) {
		ArrayList<Employee> temp = new ArrayList<Employee>();
		for(Employee emp : list) {
			if(emp.getAddr().equals(addr)) {
				temp.add(emp);
			}
			
		}
		return temp;
	}

	@Override
	public void findEmployees() {
		// TODO Auto-generated method stub
		for(Employee emp : list){
			System.out.println(emp);
		}
	}
	
	

}
