package edu.buffalo.cse116;

public class Cylinder extends Circle {
	private double height;
	
	public Cylinder(double startRadius, double startHeight) {
		super(startRadius);
		height = startHeight;
	}
	
	public void setHeight(double startHeight) {
		height = startHeight;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getVolume() {
		return (Math.PI * height * (Math.pow(getRadius(), 2)));
	}
	
	

}
