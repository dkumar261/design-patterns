package com.designpattern.adapter;

/**
 * Adapter Design Pattern Implementation We have two different approaches to
 * implement the adapter pattern. 
 * 
 * Object Adapter Pattern
 */
public class Test {

	public static void main(String[] args) {
		Movable bugattiVeyron = new Audi();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);

		System.out.println("Speed in KPH = " + bugattiVeyronAdapter.getSpeed());
		System.out.println("Speed in MPH = " + bugattiVeyron.getSpeed());
	}
}
