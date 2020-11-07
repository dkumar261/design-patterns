package com.designpattern.adapter.v2;

public class IndianConnectorImpl implements IndianConnector {

	@Override
	public void supplyPower() {
		System.out.println("Power is supplied to Indian Type connector");
	}

}
