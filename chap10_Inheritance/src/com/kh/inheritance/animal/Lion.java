package com.kh.inheritance.animal;

public class Lion extends Animal{
	
	public Lion(String name) {
		super(name);
	}
	
	@Override
	public void eat() {
		System.out.println("사자가 먹이를 먹습니다");
	}
}
