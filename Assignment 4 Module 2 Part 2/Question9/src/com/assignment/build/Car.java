package com.assignment.build;

import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class Car extends Vehicle{
	@Setter
	private int numDoors;
	
	@Override
	public void calculateRentalFee() {
		super.calculateRentalFee();
		if(this.numDoors > 2)
			this.rentAmount += this.getNumberOfDays()*10;
	}
}
