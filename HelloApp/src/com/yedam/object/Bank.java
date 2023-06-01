package com.yedam.object;

public class Bank {
	String accountNo; //unique
	String owner;
	int balance; //잔고
	
	Bank(String accountNo, String owner, int balance){
		this.accountNo = accountNo;
		this.owner = owner;
		this.balance = balance;
	}
}
