package com.edu.self.test;

import com.edu.self.Account;
import com.edu.self.Customer;

public class BankAppTest {

	public static void main(String[] args) {

//		Account ac1 = new Account(123, "신한", 5000.0);
//		Account ac2 = new Account(1234, "국민", 10000.0);
		
		
		Customer cu1 = new Customer();
		Customer cu2 = new Customer();
		
		cu1.setCustName("문동은");
		cu1.setAddress("서울");
		
		
		//cu1.setAccount(ac1);
		cu1.setAccount(new Account(123, "신한", 5000.0));
		
		
		cu2.setCustName("김연진");
		cu2.setAddress("용인");
		
		//cu2.setAccount(ac2);
		cu2.setAccount(new Account(1234, "국민", 10000.0));
		
		
		// Account get 사용하기
		Account dongAcc = cu1.getAccount();
		dongAcc.deposit(1500.0);
		dongAcc.withdraw(2000.0);
		System.out.println("동은이의 정보");
		System.out.println("잔액확인: " + dongAcc.getBalance() + "원");
		
		
//		
//		cu2.withdraw(3000.0);
//		cu2.deposit(1500.0);
//		
//		Account ac3 = cu1.getAccount();
//		System.out.println(ac3.getBalance());
//		
//
//		Account ac4 = cu2.getAccount();
//		System.out.println(ac4.getBalance());
//		
		
		

	}

}
