package com.edu.collection.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("DD");
		list.add("DBB");
		list.add("CC");
		list.add("AD");
		list.add("DD");
		
		System.out.println(list);
		
		//1.AA 삭제
		System.out.println(list.remove(1) + "데이터 삭제 성공");
		
		
		
		System.out.println(list);
		
		list.remove("CC");
		System.out.println(list);
		
		list.add(0, "HH");
		System.out.println(list);
		
		System.out.println(list.get(2));
	}

}
