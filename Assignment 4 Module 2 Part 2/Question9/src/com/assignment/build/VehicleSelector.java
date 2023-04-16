package com.assignment.build;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor (access = AccessLevel.PRIVATE)
public class VehicleSelector {
	
	public static Vehicle getInstance(VehicleType choice) {
		switch(choice) {
		case CAR : return new Car();
		case MOTORCYCLE : return new Motorcycle();
		case TRUCK : return new Truck();
		}
		return null;
	}
	
}
