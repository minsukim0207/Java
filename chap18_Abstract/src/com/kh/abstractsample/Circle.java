package com.kh.abstractsample;

public class Circle extends Shape {
	
	private double radius;
	
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * this.radius * this.radius;
	}
}
