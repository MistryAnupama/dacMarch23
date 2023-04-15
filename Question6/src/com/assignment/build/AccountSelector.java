package com.assignment.build;

public class AccountSelector {
	private AccountSelector() {
		// TODO Auto-generated constructor stub
	}

	public static Account getInstance(AccountType choice) {
		switch(choice) {
		case SAVINGS_ACCOUNT : return new SavingsAccount();
		case CHECKING_ACCOUNT : return new CheckingAccount();
		}
		return null;
	}
	
}
