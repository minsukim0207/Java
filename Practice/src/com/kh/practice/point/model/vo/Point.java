package com.kh.practice.point.model.vo;

public class Point {
	
	private int x, y;
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}
	
	public String toString() {
		
		return String.format("좌표 x: %s\n좌표 y: %s", this.x, this,y);

	}

}
