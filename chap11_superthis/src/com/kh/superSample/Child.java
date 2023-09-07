package com.kh.superSample;

public class Child extends Parent{
	
	public Child() {
		super(); // 부모클래스 기본생성자 호출
		System.out.println("자식클래스의 기본 생성자");
	}
	
	public Child(String name) {
		super(name); // 부모클래스의 문자열 파라미터 생성자 호출
		System.out.println("자식클래스의 문자열 파라미터 생성자");
	}
	
	public void display() {
		super.show(); // 부모클래스의 show 메서드 호출
		System.out.println("자식클래스의 display 메서드");
	}
}
