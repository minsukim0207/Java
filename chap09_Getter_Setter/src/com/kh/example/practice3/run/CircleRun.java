package com.kh.example.practice3.run;
import com.kh.example.practice3.model.vo.*;

public class CircleRun {

	public static void main(String[] args) {
		Circle circle = new Circle();
		
		circle.setPI(3.14);
		circle.setRadius(1);
		
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

