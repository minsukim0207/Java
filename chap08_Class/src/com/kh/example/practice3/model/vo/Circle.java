package com.kh.example.practice3.model.vo;

public class Circle {
	double PI = 3.14;
	int radius = 1;
	
	public void incrementRadius() {
		System.out.println("원의 반지름 증가");
		this.radius++;
		System.out.println("현재 원의 반지름: " + this.radius);
	}
	
	public void getAreaOfCircle() {
		System.out.println("원의 면적: " + this.PI * this.radius * this.radius);
	}
	
	public void getSizeOfCircle() {
		System.out.println("원의 둘레: " + this.PI * (this.radius * 2));
	}
}
