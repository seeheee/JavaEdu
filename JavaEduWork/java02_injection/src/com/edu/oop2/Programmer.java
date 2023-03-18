package com.edu.oop2;
/*
 * NoteBook을 가지고 있는 개발자 클래스
 * 
 * 이름, 주요기술, 급여, 주소
 *         +  
 *      NoteBook
 *      
 *  수평적인 관계 - hasing 관계
 *  수직적인 관계 - 상속 관계
 */

public class Programmer {
	public String name;
	public String mainSkill;
	public double salary;
	public String address;
	
	// 선언
	public NoteBook noteBook;
	
	// 값 주입
	public void setProgrammer(String name, String mainSkill, double salary, String address) {
		this.name = name;
		this.mainSkill = mainSkill;
		this.address = address;
		this.salary = salary;
	}
	
	public void buyNoteBook(NoteBook noteBook) {
		this.noteBook = noteBook;
	}
	
	public NoteBook getNoteBook() {
		return noteBook;
	}
	
	// 추가적으로 필요한 기능을 정의
	public String getNoteBookInfo() {
		return name+","+mainSkill+","+salary+","+address;
	}

	// 추가적인 기능 - 연봉 리턴
	public double getAnnualSalary() {
		return salary * 12 + 1000000;
	}
}
