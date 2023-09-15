package com.kh.hw.person.model.vo;

public class Student extends Person {
	
	private int grade;
	private String major;
	
	public Student() {
		
	}
	
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(name, age, height, weight);
		this.grade = grade;
		this.major = major;
	}
	
	@Override
	public String toString() {
		return "이름: " + super.getName() + " 나이: " + super.getAge() + " 키: " + super.getHeight() + " 몸무게: " + super.getWeight() + " 학년: " + this.grade + " 전공: " + this.major;
	}
	
	public int getGrade() {
		return this.grade;
	}
	
	public String getMajor() {
		return this.major;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
}
