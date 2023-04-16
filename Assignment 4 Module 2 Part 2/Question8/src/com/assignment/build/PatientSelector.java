package com.assignment.build;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor (access = AccessLevel.PRIVATE)
public class PatientSelector {
	
	public static Patient getInstance(PatientType choice) {
		switch(choice) {
		case INPATIENT : return new InPatient();
		case OUTPATIENT : return new OutPatient();
		}
		return null;
	}
	
}
