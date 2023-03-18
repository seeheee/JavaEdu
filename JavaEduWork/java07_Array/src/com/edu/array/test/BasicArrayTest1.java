package com.edu.array.test;
/*
 * Array
 * Same DataType을 가지는 여러개의 값들이 하나의 변수를 통해서 처리되는 것
 * 배열은 객체다.
 * 
 * */
public class BasicArrayTest1 {

	public static void main(String[] args) {
		// 1. 배열 선언
//		int[] arr;
		
		// 2. 배열 생성 (사이즈 명시)
//		arr = new int[3];
		
		//1,2번 한줄로
		int[] arr = new int[3];
		
		// 3. 명시적 초기화
		arr[0] = 11;
		arr[1] = 22;
		arr[2] = 33;
		
		System.out.println(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
