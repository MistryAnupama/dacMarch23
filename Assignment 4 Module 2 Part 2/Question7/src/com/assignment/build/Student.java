package com.assignment.build;

public class Student {
	private String name;
	private int ID;
	private String major;
	private double gpa;
	private int creditHours;
	protected double tuition;
	public Student() {
		// TODO Auto-generated constructor stub
	}	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public int getCreditHours() {
		return creditHours;
	}
	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}
	public double getTuition() {
		return tuition;
	}
	public void setTuition(double tuition) {
		this.tuition = tuition;
	}
	public void calculateTuition() {
		// TODO Auto-generated method stub
	}
	@Override
	public String toString() {
		return "Name : "+this.name+"		Tuition : "+this.tuition;
	}
}
