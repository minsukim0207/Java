package com.kh.classSample;

public class Car {
	// 1. 상태 필드 멤버변수
	String brand;
	String model;
	int maxSpeed;
	boolean engineOn;
	
	// 2. 생성자
	// 메서드의 한가지 종류
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
	
	// 엔진 시작 메서드
	public void startEngine() {
		if (engineOn) {
			System.out.println("엔진을 시동합니다."); // 출력 메서드 작성
		} else {
			System.out.println("이미 엔진이 켜져 있습니다.");
		}
	}
		
	public void accelerate(int amount) {
		if (engineOn) {
			System.out.println("현재 속도: " + amount);
		} else {
			System.out.println("속도 알 수 없음");
		}
	}
}
