package com.designpattern.adapter.v2;

public class USAToIndiaConnectorAdapter implements USAConnector {

	
	private IndianConnector  indianConnector;
	
	public USAToIndiaConnectorAdapter(IndianConnector  indianConnector) {
		this.indianConnector = indianConnector;
	}
	
	@Override
	public void supplyPower() {
		System.out.println("Power is supplied to Indian type adapter in USA socket");
		indianConnector.supplyPower();
	}

}
