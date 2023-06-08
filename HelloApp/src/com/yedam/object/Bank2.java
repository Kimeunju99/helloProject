package com.yedam.object;

public class Bank2 {
	
	//생성자
	public String accountNo; //unique
	public String owner;
	public int balance; //잔고
	Bank2(String accountNo, String owner, int balance){
		this.accountNo = accountNo;
		this.owner = owner;
		this.balance = balance;
	}
	
	//method
	public String getAccountNo() {	return accountNo;	}
	public void setAccountNo(String accountNo) {	this.accountNo = accountNo;	}
	
	public String getOwner() {	return owner;	}
	public void setOwner(String owner) {	this.owner = owner; }
	
	public int getBalance() {	return balance;	}
	public void setBalance(int balance) {	this.balance = balance;	}
	
}
