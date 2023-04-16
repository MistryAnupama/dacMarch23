package com.assignment.build;

public class SavingsAccount extends Account{
	private double interestRate;
	private int index;
	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	@Override
	public void calculateBalance() {
		if(this.index < 1) {
			this.balance += this.balance * (this.interestRate/100);
			this.index++;
		}
	}
}
