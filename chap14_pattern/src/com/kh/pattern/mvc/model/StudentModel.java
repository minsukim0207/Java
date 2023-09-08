package com.kh.pattern.mvc.model;

public class StudentModel {
	
	private String name; // �л� �̸�
	private int age; // �л� ����
	
	public StudentModel(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

}
