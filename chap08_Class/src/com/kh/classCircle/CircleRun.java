package com.kh.classCircle;

public class CircleRun {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		
		System.out.println("초기 원의 정보");
		circle.getAreaOfCircle();
		circle.sizeOfCircle();
		
		System.out.println("반지름 증가");
		circle.incerementRadius(1);
		
		System.out.println("변경된 원의 정보");
		circle.getAreaOfCircle();
		circle.sizeOfCircle();
		}

}
