package com.kh.example.practice3.model.vo;

public class Circle {
	double PI = 3.14;
	int radius = 1;
	
	public void incrementRadius() {
		System.out.println("���� ������ ����");
		this.radius++;
		System.out.println("���� ���� ������: " + this.radius);
	}
	
	public void getAreaOfCircle() {
		System.out.println("���� ����: " + this.PI * this.radius * this.radius);
	}
	
	public void getSizeOfCircle() {
		System.out.println("���� �ѷ�: " + this.PI * (this.radius * 2));
	}
}
