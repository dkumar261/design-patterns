package com.designpattern.solid.openclosedprinciple;


public class ClaimApprovalManager {

	public void processClaim(InsuranceSurveyor surveyor) {
		if (surveyor.isValidateClaim()) {
			System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
		}
		
	}
}
