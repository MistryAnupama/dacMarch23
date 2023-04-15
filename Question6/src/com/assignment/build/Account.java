package com.assignment.build;

public class Account {
	private String accountNumber;
	protected double balance;
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	public void withdraw(double amount) {
		if(this.balance >= amount)
			this.balance -= amount;
		else
			System.out.println("Insufficient fund");
	}
	public void calculateBalance() {
		// TODO Auto-generated method stub

	}
	@Override
	public String toString() {
		return "Account Number : "+this.accountNumber+"		balance : "+this.balance;
	}
}
