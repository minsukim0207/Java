package com.kh.hw.person.model.vo;

public class Person {

	private String name;
	private int age;
	private double height;
	private double weight;
	
	public Person() {
		
	}
	
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public String toString() {
		return "�̸�: " + this.name + " ����: " + this.age + " Ű: " + this.height + " ������: " + this.weight;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public double getWeight() {
		return this.height;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAget(int age) {
		this.age = age;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
