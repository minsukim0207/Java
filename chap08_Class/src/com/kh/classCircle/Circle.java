package com.kh.classCircle;

public class Circle {
	
	final double PI = 3.14;
	private int radius = 1;
	
	public Circle() {
		
	}
	
	public void incerementRadius(int radius) {
		this.radius += radius;
	}
	
	public void getAreaOfCircle() {
		double area = PI * radius * radius;
		System.out.println("원의 넓이: " + area);
	}
	
	public void sizeOfCircle() {
		System.out.println("원의 반지름: " + radius);
	}

}
