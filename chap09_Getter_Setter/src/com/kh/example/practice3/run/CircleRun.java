package com.kh.example.practice3.run;
import com.kh.example.practice3.model.vo.*;

public class CircleRun {

	public static void main(String[] args) {
		Circle circle = new Circle();
		
		circle.setPI(3.14);
		circle.setRadius(1);
		
		System.out.println("�ʱ� ���� ����");
		circle.getAreaOfCircle();
		circle.sizeOfCircle();
		
		System.out.println("������ ����");
		circle.incerementRadius(1);
		
		System.out.println("����� ���� ����");
		circle.getAreaOfCircle();
		circle.sizeOfCircle();
		}
}

