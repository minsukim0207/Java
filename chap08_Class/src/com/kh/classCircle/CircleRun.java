package com.kh.classCircle;

public class CircleRun {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		
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
