package com.ssi;

public class Account implements Comparable<Account> {

	private int accountNo;
	private String name;
	private int balance;
	
	
	public Account(int accountNo, String name, int balance) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}


	public int getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", name=" + name + ", balance=" + balance + "]";
	}


	@Override
	public int compareTo(Account other) {
	
		int n1= this.balance-other.balance;
		if(n1==0) {
			//return this.accountNo-other.accountNo;
			return this.name.compareTo(other.name);
		}else {
			return n1;
		}
	}


	
}
