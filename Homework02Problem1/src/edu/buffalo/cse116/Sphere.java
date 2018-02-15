package edu.buffalo.cse116;

public class Sphere extends Circle {
	
	public Sphere(double startRadius) {
		super(startRadius);
	}
	
	public double getArea() {
		return Double.NaN;
	}
	
	public double getVolume() {
		return (4.0/3.0) * Math.PI * Math.pow(getRadius(), 3);
	}

	
}
