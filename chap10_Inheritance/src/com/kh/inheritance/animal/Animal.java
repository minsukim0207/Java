package com.kh.inheritance.animal;

public class Animal {
	
	private String name;
	private int age;
	
	public Animal(String name) {
		this.name = name;
	}
	public void setName() {
		this.name = name;
	}
	 
	public String getName() {
		return name;
	}
	
	public void info() {
		System.out.println("이름 " + this.name);
	}

	public void eat() {
		System.out.println(this.name + " 동물이 먹이를 먹습니다.");
	}
	
	public void sleep() {
		System.out.println(this.name + "이 잠을 잡니다");
	}

}
