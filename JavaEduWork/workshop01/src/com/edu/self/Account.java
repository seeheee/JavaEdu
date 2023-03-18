package com.edu.self;

public class Account {
	private int actNumber;
	private String bankName;
	private double balance;
	
	
	// 무조건 모든 필드에 값이 들어가야지만 됨
	public Account(int actNumber, String bankName, double balance) {
		this.actNumber = actNumber;
		this.bankName = bankName;
		this.balance = balance;
	}
	
	public Account() {}
	
	public int getActNumber() {
		return actNumber;
	}
	public void setActNumber(int actNumber) {
		this.actNumber = actNumber;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public void withdraw(double amount) {
		if (amount > balance) {
			 System.out.println("잔액이 부족합니다.");
		}
		else {
			balance = balance - amount;
		}
	}

	
	public void deposit(double amount) {
		if (amount >= 1000.0) {
			balance =  balance + amount;
		}
		else {
			 System.out.println("1천원 이상의 금액을 입금하세요.");
		}
	}
}
