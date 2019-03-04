package com.designpattern.solid.openclosedprinciple;

/*
 * Open Close Principle Good Example !!
 */

public class Test {

	public static void main(String[] args) {
		HealthInsuranceSurveyor healthInsuranceSurveyor = new  HealthInsuranceSurveyor();
		VehicleInsuranceSurveyor vehicleInsuranceSurveyor = new VehicleInsuranceSurveyor();
		ClaimApprovalManager approvalManager = new ClaimApprovalManager();
		approvalManager.processClaim(vehicleInsuranceSurveyor);
	}
}
