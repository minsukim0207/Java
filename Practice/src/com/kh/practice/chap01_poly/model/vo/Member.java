package com.kh.practice.chap01_poly.model.vo;

public class Member {
	
	private String name;
	private int age;
	private char gender;
	private int couponCount = 0;
	
	public Member() {
		
	}
	
	public Member(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public String toString() {
		String str = "회원명: " + this.name + "회원 나이: " + this.age + "성별 : " + this.gender + "쿠폰 개수: " + this.couponCount;
		return str;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public char getGender() {
		return this.gender;
	}
	
	public int getCouponCount() {
		return this.couponCount;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setCouponCount(int couponCount) {
		this.couponCount = couponCount;
	}

}
