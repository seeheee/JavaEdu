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

class Car{
	int serialNumber; //field
	static int counter; //static V
	
	Car(){
		counter++;
		serialNumber = counter;
	}
}

public class StaticExamTest2 {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		System.out.println(c1.serialNumber);
		System.out.println(c2.serialNumber);
		System.out.println(c3.serialNumber);
		
		System.out.println("==========static V=======");
		System.out.println(Car.counter);
		System.out.println(c1.counter);
		System.out.println(c2.counter);
		System.out.println(c3.counter);
		
	}

}
