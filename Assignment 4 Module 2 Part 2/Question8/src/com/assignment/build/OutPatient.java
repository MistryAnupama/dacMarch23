package com.assignment.build;

import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class OutPatient extends Patient{
	@Setter
	private double doctorFees;
	@Setter
	private double testCharges;
	
	@Override
	public void calculateBill() {
		this.bill = this.getTreatmentCharge() + this.doctorFees;
		if(this.getAge() > 60)
			this.bill += 0.95*this.testCharges;
		else
			this.bill += this.testCharges;
	}
}
