package com.assignment.build;

public class CheckingAccount extends Account{
	private double overdraftLimit;
	private int index;

	public CheckingAccount() {
		// TODO Auto-generated constructor stub
	}
	
	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public void withdraw(double amount) {
		if(this.balance >= -this.overdraftLimit && (this.balance-amount) >= -this.overdraftLimit)
			this.balance -= amount;
		else
			System.out.println("Overdraft limit");
	}
	@Override
	public void calculateBalance() {
		if(this.index < 1) {
			if(this.balance < 0) {
				this.balance -= 20;
				this.index++;
			}
		}
	}
}
