package com.assignment.main;

import com.assignment.test.StudentTest;

public class Program {

	public static void main(String[] args) {
		int choice;
		StudentTest test=new StudentTest();
		while((choice = StudentTest.menuList()) != 0) {
			switch(choice) {
			case 1:
				test.addStudent();
				break;
			case 2:
				test.printTuition();
				break;
			case 3:
				test.printTotalTuition();
				break;
			default :
				System.out.println("Invalid choice");
			}
		}
	}
}
