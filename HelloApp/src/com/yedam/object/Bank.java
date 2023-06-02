package com.yedam.object;

public class Bank {
	
//	//생성자
//	String accountNo; //unique
//	String owner;
//	int balance; //잔고
//	Bank(String accountNo, String owner, int balance){
//		this.accountNo = accountNo;
//		this.owner = owner;
//		this.balance = balance;
//	}
	
	//method
	private String accountNo; //unique
	private String owner;
	private int balance; //잔고
	
	public String getAccountNo() {	return accountNo;	}
	public void setAccountNo(String accountNo) {	this.accountNo = accountNo;	}
	
	public String getOwner() {	return owner;	}
	public void setOwner(String owner) {	this.owner = owner; }
	
	public int getBalance() {	return balance;	}
	public void setBalance(int balance) {	this.balance = balance;	}
	
}
