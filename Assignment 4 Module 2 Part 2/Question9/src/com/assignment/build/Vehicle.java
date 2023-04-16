package com.assignment.build;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class Vehicle {
	@Setter
	private String model;
	@Setter 
	private int year;
	@Setter @Getter
	private int numberOfDays;
	@Setter
	private double dailyRentalRate;
	@Getter
	protected double rentAmount;
	
	public void calculateRentalFee() {
		this.rentAmount = this.dailyRentalRate * this.numberOfDays;
	}
	@Override
	public String toString() {
		return "Name : "+this.model+"		"+ this.getClass().getSimpleName()+"		Rent : "+this.rentAmount;
	}
}
