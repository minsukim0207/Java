package com.kh.inheritance.animal;

public class Dog extends Animal{
	
	public Dog (String name) {
		super(name); // ����Ŭ���� Animal�� ����� �����ϴµ� ���
	}
	
	public void speak() {
		System.out.println(" �۸�");
	}
}
