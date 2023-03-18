package com.edu.runtime.test;
/*
 * RunTimeException은 컴파일은 성공... 컴파일러가 인식 못함
 * 실행할때 예외가 발생
 * 
 * RunTimeException은 코드 수정하면 해결됨
 * 
 * try{
 * 
 * }
 * catch{
 * }
 * 
 */
public class RuntimeExceptionTest1 {
	// 자바에서 버그(예외)는 객체로 만들어진다.

	public static void main(String[] args) {
		String[] str = {
				"Hello",
				"No, I mean it",
				"Nice to meet you"
		};
		
		int i = 0;
		while(i<=3) {
			try {
				System.out.println(str[i]);
				
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("nice catch");
			}
			i++;
		}
		System.out.println("while loop..... end");
		
	}
}
