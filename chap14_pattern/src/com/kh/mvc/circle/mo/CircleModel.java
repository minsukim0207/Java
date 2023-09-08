package com.kh.mvc.circle.mo;

public class CircleModel {
	
	private double number;
	
	public void setNumber(double number) {
		this.number = number;
	}
	
	public double getNumber() {
		return this.number * this.number;
	}
}
