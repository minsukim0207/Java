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
		return "�̸�: " + super.getName() + " ����: " + super.getAge() + " Ű: " + super.getHeight() + " ������: " + super.getWeight() + " �г�: " + this.grade + " ����: " + this.major;
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
