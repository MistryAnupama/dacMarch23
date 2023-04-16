package com.assignment.main;

import com.assignment.test.VehicleTest;

public class Program {

	public static void main(String[] args) {
		int choice;
		VehicleTest test=new VehicleTest();
			while((choice = VehicleTest.menuList()) != 0) {
				switch(choice) {
				case 1:
					test.addVehicle();
					break;
				case 2:
					test.printRentalFee();
					break;
				case 3:
					test.printTotalRentalFee();
					break;
				default :
					System.out.println("Invalid choice");
				
			} 
		}
	}
}
