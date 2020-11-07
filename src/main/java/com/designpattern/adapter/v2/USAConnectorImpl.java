package com.designpattern.adapter.v2;

public class USAConnectorImpl implements USAConnector {

	@Override
	public void supplyPower() {
		System.out.println("Power is supplied to USA Type connector");
	}

}
