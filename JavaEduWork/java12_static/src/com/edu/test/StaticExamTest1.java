package com.edu.test;
/*
 * static 성질
 * 1. static으로 지정된 멤버는 객체 생성 과정없이 메모리 올라간다.
 * 2. class파일이 로더되는 과정에서 미리 메모리에 먼저 올라가있다.
 * 3. static한 변수는 멤버 레벨로만 사용된다.
 * 4. static한 변수는 생성된 객체들이 모두 굥유한다.
 * 5. static은 거의 final키워드와 함께 사용된다.
 * 6. SingleTone Pattern
 */

class StaticExam{
	int count = 1; //field, 멤버변수
	static String name = "홍길동"; //static V, class V
	static int age = 19;
	
	public void getMember() {
		//지역변수에서는 static 사용 못함 메모리에 올라가져있지 않기 때문...
//		static String address = "민속촌";
	}
	
	public static void getMember2() {
		//static 함수에서 필드 사용 못함
//		count++;
	}
	
}



public class StaticExamTest1 {

	public static void main(String[] args) {
		//클래스이름.멤버();(이미 static은 메모리에 올라가있기 때문에)
		StaticExam.getMember2();
		
		StaticExam s = new StaticExam();
		s.getMember();
		
		
		
	}

}
