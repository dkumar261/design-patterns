package com.designpattern.solid.openclosedprinciple;

public class HealthInsuranceSurveyor implements InsuranceSurveyor {

	@Override
	public boolean isValidateClaim() {
		// TODO Auto-generated method stub
		System.out.println("HealthInsuranceSurveyor: Validating health insurance claim...");
		return true;
	}

}
