package com.kh.abstractsample;

abstract class Shape {
	// �Ϲ� �ʵ�
	private String color;
	
	// �߻� �޼��� (���� Ŭ�������� ���� �ʼ�)
	abstract double calculateArea();
	
	// ������
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
