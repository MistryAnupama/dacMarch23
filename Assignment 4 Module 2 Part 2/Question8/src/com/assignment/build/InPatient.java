package com.assignment.build;

import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class InPatient extends Patient{
	@Setter
	private int numberOfDays;
	private double roomCharges=100*this.numberOfDays;
	@Setter
	private double medicineCharges;
	
	@Override
	public void calculateBill() {
		this.bill = this.getTreatmentCharge() + this.roomCharges;
		if(this.getAge() > 60)
			this.bill += 0.9*this.medicineCharges;
		else
			this.bill += this.medicineCharges;
	}
}
