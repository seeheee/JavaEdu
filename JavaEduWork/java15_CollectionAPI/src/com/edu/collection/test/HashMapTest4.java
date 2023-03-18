package com.edu.collection.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest4 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("강호동", 90);
		map.put("이수근", 95);
		map.put("서장훈", 80);
		map.put("김희철", 70);
		
		
		Set<String> KeySet = map.keySet();
		for(String key : KeySet) {
			System.out.println(key + " : " + map.get(key));
		}
		
		int total = 0;
		for(String name : KeySet) {
			int score = map.get(name);
			total += score;
		}
		System.out.println(total);
		
		

	}

}
