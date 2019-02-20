package com.vehicles.project;

import java.util.List;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) throws Exception {
		super(plate, brand, color);
	}

	public void addWheels(List<Wheel> frontWheel, List<Wheel> backWheel) {

		Wheel fWheel = frontWheel.get(0);
		Wheel bWheel = backWheel.get(0);

		this.wheels.add(fWheel);
		this.wheels.add(bWheel);
	}
}