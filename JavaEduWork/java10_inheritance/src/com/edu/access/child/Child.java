package com.edu.access.child;

import com.edu.access.parent.Parent;

public class Child extends Parent {
	
	public void test() {
		System.out.println(publicVar);
		System.out.println(protectedVar); // 서로다른패키지이지만 상속관계이기에 public
		//System.out.println(var);
		//System.out.println(privateVar);
	}
	
	@Override
	public void access() {
		super.access();
		System.out.println("오버라이드 완료"); 
	}
	
	

}
