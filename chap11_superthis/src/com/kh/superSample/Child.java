package com.kh.superSample;

public class Child extends Parent{
	
	public Child() {
		super(); // �θ�Ŭ���� �⺻������ ȣ��
		System.out.println("�ڽ�Ŭ������ �⺻ ������");
	}
	
	public Child(String name) {
		super(name); // �θ�Ŭ������ ���ڿ� �Ķ���� ������ ȣ��
		System.out.println("�ڽ�Ŭ������ ���ڿ� �Ķ���� ������");
	}
	
	public void display() {
		super.show(); // �θ�Ŭ������ show �޼��� ȣ��
		System.out.println("�ڽ�Ŭ������ display �޼���");
	}
}
