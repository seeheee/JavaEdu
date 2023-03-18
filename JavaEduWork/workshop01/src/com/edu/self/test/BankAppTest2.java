package com.edu.self.test;

import com.edu.self.Account;
import com.edu.self.Customer;

public class BankAppTest2 {

	public static void main(String[] args) {

//		Account ac1 = new Account(123, "신한", 5000.0);
//		Account ac2 = new Account(1234, "국민", 10000.0);
		
		Account[] accounts = {
				new Account(123, "신한", 5000.0),
				new Account(1234, "국민", 10000.0),
		};
		
		
		Customer cu1 = new Customer("문동은", "신대방동");
	
		for(Account a : accounts) System.out.println(a.getBankName());
		
		cu1.setAccounts(accounts);
		
		// 고객이 개설한 통장 반환 받기
		Account[] custAcc = cu1.getAccounts();
		
		
		for(Account a : accounts) {
			if(a.getBankName().equals("국민은행")) {
				a.deposit(200000.0);
				System.out.println(a.getBalance());
			}
		}
		

	}

}
