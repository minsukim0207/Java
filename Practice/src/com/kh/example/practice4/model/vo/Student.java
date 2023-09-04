package com.kh.example.practice4.model.vo;

public class Student {
	int grade;
	int classroom;
	String name;
	double height;
	char gender;
	
	public Student(int grade, int classroom, String name, double height, char gender) {
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.height = height;
		this.gender = gender;
	}
	
	public void information() {
		System.out.println("학년: " + this.grade);
		System.out.println("반: " + this.classroom);
		System.out.println("이름: " + this.name);
		System.out.println("키: " + this.height);
		System.out.println("성별: " + this.gender);
	}
}
