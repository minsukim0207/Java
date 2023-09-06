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
		System.out.println("�̸� " + this.name);
	}

	public void eat() {
		System.out.println(this.name + " ������ ���̸� �Խ��ϴ�.");
	}
	
	public void sleep() {
		System.out.println(this.name + "�� ���� ��ϴ�");
	}

}
