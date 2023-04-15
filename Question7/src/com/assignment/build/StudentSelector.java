package com.assignment.build;

public class StudentSelector {
	private StudentSelector() {
		// TODO Auto-generated constructor stub
	}
	public static Student getInstance(StudentType choice) {
		switch(choice) {
		case UNDERGRADUATE : return new UndergraduateStudent();
		case GRADUATE : return new GraduateStudent();
		}
		return null;
	}
	
}
