package com.edu.user.test;
/*
 * 사용자 정의 
 * 1. 내가 고의로 특정한 조건에서 일부러 예외를 발생시키는 것
 * 2. 내가 예외 클래스를 정의해서 사용
 */
class ZeroDivided extends Exception {
	ZeroDivided(){
		this("this is a ZeroExcetion");
	}
	ZeroDivided(String message){
		super(message);
	}
}




class UserExam {
	public void go() throws ZeroDivided{
		System.out.println("2.go 실행...");
		int i = 10;
		int j = 0;
		
		if(j==0) {
			// 여기서 고의적으로 폭탄을 터뜨리겠다...ArithmeticException
			throw new ZeroDivided("분모가 0이면 안됨");
		}
	}
}



public class UserExceptionTest3 {

	public static void main(String[] args) {
		System.out.println("1. go호출");
		UserExam user = new UserExam();
		
		try {
			user.go();
		} catch(ZeroDivided e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("프로그램 정상종료합니다.");
		
	}

}