package com.edu.oop2.test;


import com.edu.oop2.NoteBook;
import com.edu.oop2.Programmer;

public class ProgrammerAppTest1 {

	public static void main(String[] args) {

		Programmer pg = new Programmer();
		pg.setProgrammer("문동은", "java", 120.0, "경기도 용인시");
		
		NoteBook nb = new NoteBook();
		nb.setNoteBook("hp", 130, 123);
		
		pg.buyNoteBook(nb);
		
		
		
		NoteBook pros = pg.getNoteBook();
		System.out.println(pros.getNoteBookInfo());
		
		System.out.println(pg.getAnnualSalary());
		

	}

}
