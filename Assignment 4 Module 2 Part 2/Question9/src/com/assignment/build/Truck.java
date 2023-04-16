package com.assignment.build;

import lombok.Setter;

public class Truck extends Vehicle {
	@Setter
	private double cargoCapacity;
	@Override
	public void calculateRentalFee() {
		super.calculateRentalFee();
		if(this.cargoCapacity > 5000)
			this.rentAmount += this.getNumberOfDays()*30;
	}

}
