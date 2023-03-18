package com.edu.self.test;
import java.util.Arrays;

public class ArrayAppTest {
	static int[]  list = { 34, 23, 64, 25, 12, 75, 22, 88, 53, 37 };
	
	public static void main(String[] args) {	
		print(list);
		total(list);
		average(list);
		minimum(list);
		selectSort(list);
	}
	
	static void print(int[] arr) { 
		System.out.println("전체를 출력합니다.");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println(" ");
	}

	static void total(int[] arr) {	
		System.out.println("합계를 출력합니다.");
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		System.out.println(total);
	}
		
	static void average(int[] arr) {
		System.out.println("평균를 출력합니다.");
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		System.out.println(total/arr.length);
	}
	
	static void minimum(int[]arr) {
		System.out.println("최소값을 출력합니다.");
		int min = arr[0];
		for(int i = 1; i < arr.length-1; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}
	
	static void selectSort(int[]arr) {
		System.out.println("오름차순으로 정렬합니다.");
		Arrays.sort(arr);
		
		for(int i : arr) {
			System.out.print(i+ " ");
		}
		
//		int x = 0;
//		for(int i = 1; i < arr.length-1; i++) {
//			if (arr[i] > arr[i+1]) {
//				x = arr[i];
//				arr[i] = arr[i+1];
//				arr[i+1] = x; 
//			}
//			
//			
//		}
		
	}
	
}
