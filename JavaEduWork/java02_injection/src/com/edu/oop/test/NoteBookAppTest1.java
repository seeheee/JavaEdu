package com.edu.oop.test;
/**/

import com.edu.oop.NoteBook;

public class NoteBookAppTest1 {

	public static void main(String[] args) {
		
		NoteBook nb = new NoteBook();
		nb.setNoteBook("HP", 1300000, 112233);
		
//		잘못된 예시
//		nb.brand = "HP";
//		nb.price = 130000;
//		nb.serialNumber = 112233;
		System.out.println(nb.getNoteBookInfo());
		

	}

}
