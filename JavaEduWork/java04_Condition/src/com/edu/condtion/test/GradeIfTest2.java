package com.edu.condtion.test;

import java.util.Scanner;

/*
 * 
 * 
 * */

public class GradeIfTest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("성적 입력 >>>");
//		int grade = 88; //로컬 변수 초기화
		int grade = sc.nextInt();
		
		
		System.out.println("과목 입력 >>>");
		String subject = sc.next();
		
		if(grade<=100 && grade > 90) { //앞부분이 F면 뒤부분은 상관없이 건너뜀
			System.out.println(subject+"A Grade...");
		}else if(grade<=90 && grade > 80) {
			System.out.println(subject + "B Grade...");
		}else if(grade<=80 && grade > 70) {
			System.out.println(subject + "C Grade...");
		}else  {
			System.out.println(subject+"Try...");
		}

	}

}
