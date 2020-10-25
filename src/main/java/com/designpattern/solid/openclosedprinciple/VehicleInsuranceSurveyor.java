package com.designpattern.solid.openclosedprinciple;

public class VehicleInsuranceSurveyor implements InsuranceSurveyor {

	@Override
	public boolean isValidateClaim() {
		// TODO Auto-generated method stub
		System.out.println("VehicleInsuranceSurveyor: Validating health insurance claim...");
		return true;
	}

}
