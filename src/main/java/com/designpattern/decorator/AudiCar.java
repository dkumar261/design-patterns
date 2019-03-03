package com.designpattern.decorator;

public class AudiCar extends CarDecorator{

	public AudiCar(Car c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void assemble() {
		// TODO Auto-generated method stub
		super.assemble();
		System.out.println("Model is Audi ");
	}
}
