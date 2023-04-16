package com.assignment.test;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.assignment.build.Patient;
import com.assignment.build.PatientSelector;
import com.assignment.build.PatientType;
import com.assignment.build.OutPatient;
import com.assignment.build.InPatient;

public class PatientTest {
	private static Scanner sc=new Scanner(System.in);
	private Patient[] p=new Patient[10];
	private int index;
	
	public void addPatient() throws InputMismatchException {
		PatientType choice=PatientTest.patientMenu();
		if(this.index < this.p.length) {
			this.p[this.index]=PatientSelector.getInstance(choice);
			PatientTest.acceptRecord(this.p[this.index]);
			this.index++;
		}
		else
			System.out.println("No more beds available");
	}
	public void printBill() {
		System.out.println();
		boolean flag=false;
		for(Patient p1 : p) {
			if(p1 != null) {
				System.out.println(p1);
				flag=true;
			}
		}
		if(flag==false)
			System.out.println("No patients");
	}
	public void printTotalBill() {
		System.out.println();
		boolean flag=false;
		double sum=0;
		for(Patient p1 : p) {
			if(p1 != null) {
				sum += p1.getBill();
				flag=true;
			}
		}
		if(flag==false)
			System.out.println("No patients");
		else
			System.out.println("Total Bill : "+sum);
	}
	
	private static void acceptRecord(Patient patient) {
		if(patient != null) {
			sc.nextLine();
			System.out.println();
			System.out.print("Enter name : ");
			patient.setName(sc.nextLine());
			System.out.print("Enter ID : ");
			patient.setID(sc.nextInt());
			System.out.print("Enter age : ");
			patient.setAge(sc.nextInt());
			
			if(patient instanceof OutPatient) {
				OutPatient op=(OutPatient) patient;
				sc.nextLine();
				System.out.print("Enter doctor fee : ");
				op.setDoctorFees(sc.nextDouble());
				System.out.print("Enter test charges : ");
				op.setTestCharges(sc.nextDouble());
			}
			else {
				InPatient ip = (InPatient) patient;
				sc.nextLine();
				System.out.print("Enter days : ");
				ip.setNumberOfDays(sc.nextInt());
				System.out.print("Enter medicine charges : ");
				ip.setMedicineCharges(sc.nextDouble());
			}
			patient.calculateBill();
		}
	}
	
	private static PatientType patientMenu() {
		System.out.println();
		System.out.println("0. Inpatient");
		System.out.println("1. Outpatient");
		System.out.print("Enter choice : ");
		return PatientType.values()[sc.nextInt()];
	}
	public static int menuList(){
		System.out.println();
		System.out.println("0.Exit");
		System.out.println("1.Add patient");
		System.out.println("2.Print bill");
		System.out.println("3.Print total bill of the hospital");
		System.out.print("Enter choice : ");
		return sc.nextInt();
	}
	

	

	
	

	

	
	

	
	

	

}
