package com.kh.practice.point.controller;
import com.kh.practice.point.model.vo.*;

public class CircleController {
	
	Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		double circle = Math.PI * c.getRadius() * c.getRadius();
		
		String output = c.toString() + String.format("원 넓이: %s\n", circle);
		
		return output;
	}
	
	public String calcCircum(int x, int y, int radius) {
		
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		double circum = Math.PI * c.getRadius() * 2;
		
		String output = c.toString() + String.format("원 둘레: %s\n", circum);
		
		return output;
		
	}

}
