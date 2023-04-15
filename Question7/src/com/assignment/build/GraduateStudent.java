package com.assignment.build;

public class GraduateStudent extends Student{
	private double tuitionRate=1000;
	private double researchFee;
	public GraduateStudent() {
		// TODO Auto-generated constructor stub
	}
	public double getResearchFee() {
		return researchFee;
	}
	public void setResearchFee(double researchFee) {
		this.researchFee = researchFee;
	}
	@Override
	public void calculateTuition() {
		this.tuition = this.tuitionRate * this.getCreditHours();
		if(this.researchFee > 5000)
			this.tuition *= 0.9;
	}
}
