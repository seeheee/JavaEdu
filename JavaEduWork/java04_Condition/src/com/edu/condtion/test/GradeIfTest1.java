package com.edu.condtion.test;

/*
 * Short Circuit(&&, ||)
 * 예외상황을 건너뛸수있다
 * 
 * */

public class GradeIfTest1 {

	public static void main(String[] args) {
		int grade = 88; //로컬 변수 초기화
		
		if(grade<=100 && grade > 90) { //앞부분이 F면 뒤부분은 상관없이 건너뜀
			System.out.println("A Grade...");
		}else if(grade<=90 && grade > 80) {
			System.out.println("B Grade...");
		}else if(grade<=80 && grade > 70) {
			System.out.println("C Grade...");
		}else  {
			System.out.println("Try...");
		}

	}

}
