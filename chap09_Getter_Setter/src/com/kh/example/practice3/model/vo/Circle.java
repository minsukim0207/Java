package com.kh.example.practice3.model.vo;

public class Circle {
	
	private double PI;
	private int radius;
	
	public double getPI() {
		return PI;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setPI(double PI) {
		this.PI = PI;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void incerementRadius(int radius) {
		this.radius += radius;
	}
	
	public void getAreaOfCircle() {
		double area = PI * radius * radius;
		System.out.println("���� ����: " + area);
	}
	
	public void sizeOfCircle() {
		System.out.println("���� ������: " + radius);
	}

}
