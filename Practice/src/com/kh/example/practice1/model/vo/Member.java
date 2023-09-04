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
		System.out.println("멤버의 이름이 " + this.memberName + "으로 변경되었습니다.");
	}
	
	public void printName() {
		System.out.println("멤버 정보");
		System.out.println("멤버 아이디: " + this.memberId);
		System.out.println("멤버 비밀번호: " + this.memberPwd);
		System.out.println("멤버 이름: " + this.memberName);
		System.out.println("멤버 나이: " + this.age);
		System.out.println("멤버 성별: " + this.gender);
		System.out.println("전화 번호: " + this.phone);
		System.out.println("이메일: " + this.email);
	}
}

