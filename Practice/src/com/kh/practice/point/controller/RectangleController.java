package com.kh.practice.point.controller;
import com.kh.practice.point.model.vo.*;

public class RectangleController {
	
	Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int width, int height) {
		
		r.setX(x);
		r.setY(y);
		r.setWidth(width);
		r.setHeight(height);
		
		int rectangleArea = r.getWidth() * r.getHeight();
		
		String output = r.toString() + String.format("사각형 면적: %s\n", rectangleArea);
		
		return output;
		
	}
	
	public String calcPerimeter(int x, int y, int width, int height) {
		
		r.setX(x);
		r.setY(y);
		r.setWidth(width);
		r.setHeight(height);
		
		int rectanglePerimeter = (r.getWidth() + r.getHeight()) * 2;
		
		String output = r.toString() + String.format("사각형 둘레: %s\n", rectanglePerimeter);
		
		return output;
		
	}

}
