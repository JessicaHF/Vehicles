package com.vehicles.project;

public class Wheel {
	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter) throws Exception {
		if ((diameter < 0.4) || (diameter > 1)) {
			throw new Exception("diametre no correcta. ");
		}
		this.brand = brand;
		this.diameter = diameter;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Wheel) {
			return this.brand.equals(((Wheel) obj).brand);
		}
		return super.equals(obj);
	}
}
