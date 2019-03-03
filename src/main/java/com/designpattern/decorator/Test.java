package com.designpattern.decorator;

public class Test {

	public static void main(String[] args) {
		Car sportsCar = new LuxuryCar(new SportsCar(new BasicCar()));
		sportsCar.assemble();
	}
}
