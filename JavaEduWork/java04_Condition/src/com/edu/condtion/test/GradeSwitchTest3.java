package com.edu.condtion.test;

import java.util.Scanner;

/*
 * 이전의 if문을 switch로 변경해서 사용
 * 
 * */

public class GradeSwitchTest3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("성적 입력 >>>");
		int grade = sc.nextInt();
		
		switch(grade) {
		case 95:
		case 90:
			System.out.println("A Grade...");
			break;
		case 85:
		case 80:
			System.out.println("B Grade...");
			break;
		case 75:
		case 70:
			System.out.println("C Grade...");
			break;
		default:
			System.out.println("Try...");
		}

	}

}
