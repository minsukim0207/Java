package com.kh.practice.point.model.vo;

public class Rectangle extends Point{
	
	private int width, height;
	
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public Rectangle() {
		
	}
	
	public Rectangle(int x, int y, int width, int height) {
		
	}
	
	@Override
	public String toString() {
		
		return String.format("좌표 x: %s\n좌표 y: %s\n너비: %s\n높이: %s\n", this.getX(), this.getY(), this.width, this.height);
		
	}

}
