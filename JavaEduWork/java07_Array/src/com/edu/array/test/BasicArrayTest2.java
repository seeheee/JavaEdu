package com.edu.array.test;
/*
 * 배열은 선언 + 생성 + 초기화 한번에 한다!
 * 
 * */

public class BasicArrayTest2 {

	public static void main(String[] args) {
		int[] arr1 = {11,22,33};
		int[] arr2 = {100,200,300};
		
		for(int i : arr1) System.out.println(i);
		for(int i : arr2) System.out.println(i);
		
		System.out.println(arr1);
		System.out.println(arr2);
		
		System.out.println("==================================");
		
		arr1 = arr2;
		

		for(int i : arr1) System.out.println(i);
		for(int i : arr2) System.out.println(i);
		
		System.out.println(arr1);
		System.out.println(arr2);
	}
}
