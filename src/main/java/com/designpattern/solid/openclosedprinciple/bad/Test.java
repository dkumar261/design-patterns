package com.designpattern.solid.openclosedprinciple.bad;

/*
 * Open Close Principle Bad Example !!
 */

public class Test {

	public static void main(String[] args) {
		HealthInsuranceSurveyor healthInsuranceSurveyor = new  HealthInsuranceSurveyor();
		ClaimApprovalManager approvalManager = new ClaimApprovalManager();
		approvalManager.processHealthClaim(healthInsuranceSurveyor);
		approvalManager.processVehicleClaim(new VehicleInsuranceSurveyor());
	}
}
