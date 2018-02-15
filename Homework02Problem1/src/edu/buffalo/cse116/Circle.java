package edu.buffalo.cse116;

public class Circle {
	private double radius; 
	
	public Circle(double startRadius) { 
		radius = startRadius;
	}
	
	public void setRadius(double startRadius) {
		radius = startRadius;
	}
	
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return Math.PI  * Math.pow(radius, 2); 
	}

}
