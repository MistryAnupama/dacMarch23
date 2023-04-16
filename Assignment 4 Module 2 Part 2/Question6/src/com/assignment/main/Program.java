package com.assignment.main;

import com.assignment.test.AccountTest;

public class Program {

	public static void main(String[] args) {
		int choice;
		AccountTest test=new AccountTest();
		while((choice = AccountTest.menuList()) != 0) {
			switch(choice) {
			case 1:
				test.createAccount();
				break;
			case 2:
				test.deposit();
				break;
			case 3:
				test.withdraw();
				break;
			case 4:
				test.getBalance();
				break;
			case 5:
				test.getTotalBalance();
				break;
			default :
				System.out.println("Invalid choice");
			}
		}
	}
}
