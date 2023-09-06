package com.kh.inheritance.animal;

public class Dog extends Animal{
	
	public Dog (String name) {
		super(name); // 상위클래스 Animal의 멤버에 접근하는데 사용
	}
	
	public void speak() {
		System.out.println(" 멍멍");
	}
}
