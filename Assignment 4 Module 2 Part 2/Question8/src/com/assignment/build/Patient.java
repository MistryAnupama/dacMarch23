package com.assignment.build;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public abstract class Patient {
	@Setter
	private String name;
	@Setter
	private int ID;
	@Setter @Getter
	private int age;
	@Getter
	private double treatmentCharge=500;
	@Getter
	protected double bill;
	public abstract void calculateBill();
	@Override
	public String toString() {
		return "Name : "+this.name+"		Bill : "+this.bill;
	}
}
