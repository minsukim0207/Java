package com.kh.inheritance.animal;

public class Monkey extends Animal{
	
	public Monkey(String name) {
		super(name);
	}
	
	@Override
	public void sleep() {
		System.out.println("�����̰� ���� ��ϴ�.");
	}
}
