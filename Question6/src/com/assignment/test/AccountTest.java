package com.assignment.test;

import java.util.Scanner;
import com.assignment.build.Account;
import com.assignment.build.AccountSelector;
import com.assignment.build.AccountType;
import com.assignment.build.CheckingAccount;
import com.assignment.build.SavingsAccount;

public class AccountTest {
	private static Scanner sc=new Scanner(System.in);
	private Account[] a=new Account[10];
	private int index;
	
	public void createAccount() {
		AccountType choice=AccountTest.accountMenu();
		if(this.index < this.a.length) {
			this.a[this.index]=AccountSelector.getInstance(choice);
			AccountTest.acceptRecord(this.a[this.index]);
			this.index++;
		}
		else
			System.out.println("Cannot create more accounts");
	}
	
	public void deposit() {
		sc.nextLine();
		System.out.println();
		System.out.print("Enter account number : ");
		String account=sc.nextLine();
		boolean flag=false;
		for(int i=0;i<this.index;i++) {
			if(a[i] !=null && a[i].getAccountNumber().equals(account)) {
				System.out.print("Enter amount : ");
				a[i].deposit(sc.nextDouble());
				flag=true;
			}
		}
		if(flag==false)
			System.out.println("Invalid account");
	}

	public void withdraw() {
		sc.nextLine();
		System.out.println();
		System.out.print("Enter account number : ");
		String account=sc.nextLine();
		boolean flag=false;
		for(int i=0;i<this.index;i++) {
			if(a[i] !=null && a[i].getAccountNumber().equals(account)) {
				System.out.print("Enter amount : ");
				a[i].withdraw(sc.nextDouble());
				flag=true;
			}
		}
		if(flag==false)
			System.out.println("Invalid account");
	}
	
	public void getBalance() {
		boolean flag=false;
		for(Account acc : a) {
			if(acc != null) {
				acc.calculateBalance();
				System.out.println(acc);
				flag=true;
			}
		}
		if(flag==false)
			System.out.println("No accounts present");
	}
	public void getTotalBalance() {
		boolean flag=false;
		double amount=0;
		for(Account acc : a) {
			if(acc != null) {
				acc.calculateBalance();
				amount += acc.getBalance();
				flag=true;
			}
		}
		if(flag==false)
			System.out.println("No accounts present");
		else
			System.out.println("Total balance : "+ amount);
	}

	
	private static void acceptRecord(Account account) {
		if(account != null) {
			sc.nextLine();
			System.out.println();
			System.out.print("Enter Account Number : ");
			account.setAccountNumber(sc.nextLine());
			
			if(account instanceof CheckingAccount) {
				CheckingAccount ca=(CheckingAccount) account;
				sc.nextLine();
				System.out.print("Enter overdraft limit : ");
				ca.setOverdraftLimit(sc.nextDouble());
			}
			else {
				SavingsAccount sa=(SavingsAccount) account;
				sc.nextLine();
				System.out.print("Enter interest rate : ");
				sa.setInterestRate(sc.nextDouble());
			}
		}
	}
	
	private static AccountType accountMenu() {
		System.out.println();
		System.out.println("0.Savings Account");
		System.out.println("1.Checking Account");
		System.out.print("Enter choice : ");
		return AccountType.values()[sc.nextInt()];
	}
	public static int menuList() {
		System.out.println();
		System.out.println("0.Exit");
		System.out.println("1.Create an account");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.View Balance");
		System.out.println("5.View total balance");
		System.out.print("Enter choice : ");
		return sc.nextInt();
	}

	
	

	

	
	

	
	

	

}
