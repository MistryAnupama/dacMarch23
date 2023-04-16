package com.assignment.test;

import java.util.Scanner;
import com.assignment.build.Student;
import com.assignment.build.StudentSelector;
import com.assignment.build.StudentType;
import com.assignment.build.GraduateStudent;
import com.assignment.build.UndergraduateStudent;

public class StudentTest {
	private static Scanner sc=new Scanner(System.in);
	private Student[] s=new Student[10];
	private int index;
	
	public void addStudent() {
		StudentType choice=StudentTest.studentMenu();
		if(this.index < this.s.length) {
			this.s[this.index]=StudentSelector.getInstance(choice);
			StudentTest.acceptRecord(this.s[this.index]);
			this.index++;
		}
		else
			System.out.println("Student enrollment ended");
	}
	public void printTuition() {
		System.out.println();
		boolean flag=false;
		for(Student s1 : s) {
			if(s1 != null) {
				System.out.println(s1);
				flag=true;
			}
		}
		if(flag==false)
			System.out.println("No students enrolled");
	}
	public void printTotalTuition() {
		System.out.println();
		boolean flag=false;
		double sum=0;
		for(Student s1 : s) {
			if(s1 != null) {
				sum += s1.getTuition();
				flag=true;
			}
		}
		if(flag==false)
			System.out.println("No students enrolled");
		else
			System.out.println("Total tuition : "+sum);
	}
	private static void acceptRecord(Student student) {
		if(student != null) {
			sc.nextLine();
			System.out.println();
			System.out.print("Enter name : ");
			student.setName(sc.nextLine());
			System.out.print("Enter ID : ");
			student.setID(sc.nextInt());
			System.out.print("Enter major : ");
			sc.nextLine();
			student.setMajor(sc.nextLine());
			System.out.print("Enter GPA : ");
			student.setGpa(sc.nextDouble());
			System.out.print("Enter credit hours : ");
			student.setCreditHours(sc.nextInt());
			
			if(student instanceof GraduateStudent) {
				GraduateStudent gs=(GraduateStudent) student;
				sc.nextLine();
				System.out.print("Enter research fee : ");
				gs.setResearchFee(sc.nextDouble());
			}
			student.calculateTuition();
		}
	}
	
	private static StudentType studentMenu() {
		System.out.println();
		System.out.println("0. Undergraduate");
		System.out.println("1. Graduate");
		System.out.print("Enter choice : ");
		return StudentType.values()[sc.nextInt()];
	}
	public static int menuList() {
		System.out.println();
		System.out.println("0.Exit");
		System.out.println("1.Add student");
		System.out.println("2.Print tuition");
		System.out.println("3.Print total tuition");
		System.out.print("Enter choice : ");
		return sc.nextInt();
	}
	

	

	
	

	

	
	

	
	

	

}
