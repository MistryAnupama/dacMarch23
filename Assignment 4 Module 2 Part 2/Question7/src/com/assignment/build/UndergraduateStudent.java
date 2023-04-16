package com.assignment.build;

public class UndergraduateStudent extends Student{
	private double tuitionRate=500;
	public UndergraduateStudent() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void calculateTuition() {
		this.tuition = this.tuitionRate * this.getCreditHours();
		if(this.getGpa() >= 3.5)
			this.tuition *= 0.8;
	}
}
