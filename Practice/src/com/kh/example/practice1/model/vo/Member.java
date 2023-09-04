package com.kh.example.practice1.model.vo;

public class Member {
	String memberId;
	String memberPwd;
	String memberName;
	int age;
	char gender;
	String phone;
	String email;
	
	public Member(String memberId, String memberPwd, String memberName, int age, char gender, String phone, String email) {
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
	}
	
	public void changeName(String name) {
		this.memberName = name;
		System.out.println("����� �̸��� " + this.memberName + "���� ����Ǿ����ϴ�.");
	}
	
	public void printName() {
		System.out.println("��� ����");
		System.out.println("��� ���̵�: " + this.memberId);
		System.out.println("��� ��й�ȣ: " + this.memberPwd);
		System.out.println("��� �̸�: " + this.memberName);
		System.out.println("��� ����: " + this.age);
		System.out.println("��� ����: " + this.gender);
		System.out.println("��ȭ ��ȣ: " + this.phone);
		System.out.println("�̸���: " + this.email);
	}
}

