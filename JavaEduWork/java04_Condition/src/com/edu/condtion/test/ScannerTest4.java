package com.edu.condtion.test;

import java.util.Scanner;

public class ScannerTest4 {

	public static void main(String[] args) {
		System.out.println("숫자 입력 >>>");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int var = (49 + num)/num;
		
		System.out.println(var);
		
		if (var++ > 10 && ++var > 3) {
			var = var + 10;
		}
		
		System.out.println(var);

	}

}
