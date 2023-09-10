package com.kh.practice.point.model.vo;

public class Circle extends Point{
	
	private int radius;
	
	public int getRadius() {
		return this.radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public Circle() {
		
	}
	
	public Circle(int x, int y, int radius) {
		
	}
	
	@Override
	public String toString() {
		
		return String.format("좌표 x: %s\n좌표 y: %s\n반지름: %s\n", this.getX(), this.getY(), this.radius);
		
	}

}
