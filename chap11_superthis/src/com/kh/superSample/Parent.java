package com.kh.superSample;

// ��ӹ޾Ƽ� super(), super. ������ Ȯ��
// super. = �θ�Ŭ������ ������ �޼��忡 �����ϱ� ���� ���
// super() => �θ�Ŭ������ �����ڸ� ȣ���ϱ� ����0 ���
//			  ����Ŭ������ �����ڿ��� ù ��° �ٿ� ȣ��Ǿ�� ��

public class Parent {
	
	String name;
	
	Parent() { // ���������� default
		System.out.println("�θ�Ŭ������ �⺻ ������");
	}
	
	Parent(String name) {
		this.name = name;
		System.out.println("�θ�Ŭ������ ���ڿ� �Ķ���� ������. �̸�: " + this.name);
	}
	
	public void show() {
		System.out.println("�θ�Ŭ������ show �޼���");
	}
}