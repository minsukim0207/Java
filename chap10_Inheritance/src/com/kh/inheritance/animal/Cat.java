package com.kh.inheritance.animal;

public class Cat extends Animal{
	
	public Cat(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println("고양이 달린다.");
	}
}
