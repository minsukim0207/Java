package com.kh.abstractsample.animal;

abstract class Animal {
	
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public abstract void makeSound();
	
	public void displayName() {
		System.out.println("���� �̸�: " + this.name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

}
