package com.assignment.test;

import java.util.Scanner;
import com.assignment.build.Car;
import com.assignment.build.Motorcycle;
import com.assignment.build.Truck;
import com.assignment.build.Vehicle;
import com.assignment.build.VehicleSelector;
import com.assignment.build.VehicleType;

public class VehicleTest {
	private static Scanner sc=new Scanner(System.in);
	private Vehicle[] v=new Vehicle[10];
	private int index;
	
	public void addVehicle(){
		VehicleType choice=VehicleTest.vehicleMenu();
		if(this.index < this.v.length) {
			this.v[this.index]=VehicleSelector.getInstance(choice);
			VehicleTest.acceptRecord(this.v[this.index]);
			this.index++;
		}
		else
			System.out.println("No more vehicles available");
	}
	public void printRentalFee() {
		System.out.println();
		boolean flag=false;
		for(Vehicle v1 :  v) {
			if(v1 != null) {
				System.out.println(v1);
				flag=true;
			}
		}
		if(flag==false)
			System.out.println("No vehicles");
	}
	public void printTotalRentalFee() {
		System.out.println();
		boolean flag=false;
		double sum=0;
		for(Vehicle v1 : v) {
			if(v1 != null) {
				sum += v1.getRentAmount();
				flag=true;
			}
		}
		if(flag==false)
			System.out.println("No vehicles");
		else
			System.out.println("Total Rental Bill : "+sum);
	}
	
	private static void acceptRecord(Vehicle vehicle) {
		if(vehicle != null) {
			sc.nextLine();
			System.out.println();
			System.out.print("Enter model : ");
			vehicle.setModel(sc.nextLine());
			System.out.print("Enter year : ");
			vehicle.setYear(sc.nextInt());
			System.out.print("Enter daily rental rate : ");
			vehicle.setDailyRentalRate(sc.nextDouble());
			System.out.print("Enter number of days : ");
			vehicle.setNumberOfDays(sc.nextInt());
			
			if(vehicle instanceof Motorcycle) {
				Motorcycle mc=(Motorcycle) vehicle;
				System.out.print("Enter engine size (500/1500) : ");
				mc.setEngineSize(sc.nextInt());
			}
			else if(vehicle instanceof Car) {
				Car cc = (Car) vehicle;
				System.out.print("Enter number of doors (2/4) : ");
				cc.setNumDoors(sc.nextInt());
			}
			else {
				Truck tc = (Truck) vehicle;
				System.out.print("Enter cargo capacity (4000/6000) : ");
				tc.setCargoCapacity(sc.nextDouble());
			}
			vehicle.calculateRentalFee();
		}
	}
	
	private static VehicleType vehicleMenu() {
		System.out.println();
		System.out.println("0. Car");
		System.out.println("1. Motorcycle");
		System.out.println("2. Truck");
		System.out.print("Enter choice : ");
		return VehicleType.values()[sc.nextInt()];
	}
	public static int menuList(){
		System.out.println();
		System.out.println("0.Exit");
		System.out.println("1.Add vehicle");
		System.out.println("2.Print rental bill");
		System.out.println("3.Print total rental bill");
		System.out.print("Enter choice : ");
		return sc.nextInt();
	}
	

	

	
	

	

	
	

	
	

	

}
