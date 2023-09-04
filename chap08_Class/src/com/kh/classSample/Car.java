package com.kh.classSample;

public class Car {
	// 1. ���� �ʵ� �������
	String brand;
	String model;
	int maxSpeed;
	boolean engineOn;
	
	// 2. ������
	// �޼����� �Ѱ��� ����
	public Car (String brand, String model) {
		this.brand = brand;
		this.model = model;
		this.maxSpeed = 0;
		this.engineOn = true;
	}
	
	public Car (String brand, String model, int maxSpeed) {
		this.brand = brand;
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.engineOn = true;
	}
	
	// ���� ���� �޼���
	public void startEngine() {
		if (engineOn) {
			System.out.println("������ �õ��մϴ�."); // ��� �޼��� �ۼ�
		} else {
			System.out.println("�̹� ������ ���� �ֽ��ϴ�.");
		}
	}
		
	public void accelerate(int amount) {
		if (engineOn) {
			System.out.println("���� �ӵ�: " + amount);
		} else {
			System.out.println("�ӵ� �� �� ����");
		}
	}
}
