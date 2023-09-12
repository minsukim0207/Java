package com.kh.abstractsample;

abstract class Shape {
	// 일반 필드
	private String color;
	
	// 추상 메서드 (하위 클래스에서 구현 필수)
	abstract double calculateArea();
	
	// 생성자
	public Shape(String color) {
		this.color = color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}

}
