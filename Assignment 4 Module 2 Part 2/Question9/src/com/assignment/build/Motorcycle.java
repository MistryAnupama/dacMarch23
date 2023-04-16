package com.assignment.build;

import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class Motorcycle extends Vehicle{
	@Setter
	private int engineSize;

	@Override
	public void calculateRentalFee() {
		super.calculateRentalFee();
		if(this.engineSize > 1000)
			this.rentAmount += this.getNumberOfDays()*20;
	}
	
	
	
}
