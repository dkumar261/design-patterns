package com.designpattern.factory;

class VehicleFactory {

	static Vehicle getVehicle(String type) {
		
		switch (type) {
		case "Bus": {

			return new Bus();
		}
		case "Car": {

			return new Bus();
		}
		case "Bike": {

			return new Bike();
		}
		default:
			return null;
		}
	}
}
