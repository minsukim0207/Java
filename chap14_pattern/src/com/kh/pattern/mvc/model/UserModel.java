package com.kh.pattern.mvc.model;

public class UserModel {

	// �л� ���� ǥ��
	// private �̸� ����
	// getter setter
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public UserModel(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
