package com.assignment.main;

import com.assignment.test.PatientTest;

public class Program {

	public static void main(String[] args) {
		int choice;
		PatientTest test=new PatientTest();
			while((choice = PatientTest.menuList()) != 0) {
				switch(choice) {
				case 1:
					test.addPatient();
					break;
				case 2:
					test.printBill();
					break;
				case 3:
					test.printTotalBill();
					break;
				default :
					System.out.println("Invalid choice");
				
			} 
		}
	}
}
