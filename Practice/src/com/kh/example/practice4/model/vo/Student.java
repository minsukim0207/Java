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
		System.out.println("�г�: " + this.grade);
		System.out.println("��: " + this.classroom);
		System.out.println("�̸�: " + this.name);
		System.out.println("Ű: " + this.height);
		System.out.println("����: " + this.gender);
	}
}
