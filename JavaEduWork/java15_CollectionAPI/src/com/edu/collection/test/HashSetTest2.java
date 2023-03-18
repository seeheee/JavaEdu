package com.edu.collection.test;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		
		set.add("A");
		set.add("A");
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("E");
		set.add("F");
		
		
		System.out.println(set.size());
		System.out.println(set); 
		
		//삭제는 2가지가 있음 - boolean, Object
		boolean flag = set.remove("B");
		System.out.println("B의 탈퇴처리가 되었나요? " + flag);
		
		System.out.println(set); 
		
		set.clear(); //모든 데이터를 삭제
		System.out.println("set안의 모든 데이터가 삭제되었나요? " + set.isEmpty());
		
		
		

	}

}
