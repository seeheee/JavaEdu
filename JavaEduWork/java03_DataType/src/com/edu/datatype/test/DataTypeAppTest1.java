package com.edu.datatype.test;
/*
 * Local V
 * 1) 선언된 위치가 메소드 안
 * 2) 해당 메소드 안에서만 사용할 수 있다
 * 
 * 
 * Field
 * 1) 선언된 위치가 메소드 바깥
 * 2) 클래스 어디서나 사용가능 (메모리에 올려야 한다)
 * 3) 기본값을 가지고 있어서 초기화 안해도 됨
 */

public class DataTypeAppTest1 {
	int i;
	
	
	public static void main(String[] args) {
		DataTypeAppTest1 test = new DataTypeAppTest1(); // 메모리에 올린다.
		byte b; //변수 선언
		b = 1;
		System.out.println(b);
		System.out.println(test.i); // 그리고 사용
		
		
		
		/*
		 * l1,l2가 메모리에서 소모되는 메모리는 동일하다.
		 * 테이터 타입이 중요한 요소가 된다.
		 * 변수 안에 지정된 값이 중요한 것이 아니다.
		 * 변수가 어떤 타입으로 지정되어 있느냐에 따라서 컴퓨터가 사용하는 메모리 용량이 이미 결정된다.
		 * */
		
		long l1 = 1;
		long l2 = 600000000;
		
		
		
	}
	
}
