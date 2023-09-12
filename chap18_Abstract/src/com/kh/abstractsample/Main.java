package com.kh.abstractsample;


public class Main {

	public static void main(String[] args) {

		Circle circle = new Circle("Red", 5.0);
		
		System.out.println("Circle Area: " + circle.calculateArea());
		System.out.println("Circle Color: " + circle.getColor());
		
		Rectangle rectangle = new Rectangle("Blue", 3, 4);
		
		System.out.println("Rectangle Area: " + rectangle.calculateArea());
		System.out.println("Rectangle color: " + rectangle.getColor());
	}

}
