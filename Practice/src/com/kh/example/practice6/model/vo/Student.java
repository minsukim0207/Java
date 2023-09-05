package com.kh.example.practice6.model.vo;

public class Student {
	
	private static int grade = 1;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	public static int getGrade() {
		return grade;
	}
	
	public int getClassroom() {
		return classroom;
	}
	
	public String getName() {
		return name;
	}
	
	public double getHeight() {
		return height;
	}
	
	public char getGender() {
		return gender;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Student(int classroom, String name, double height, char gender) {
		this.setClassroom(classroom);
		this.setName(name);
		this.setHeight(height);
		this.setGender(gender);
	}
	
	public void information() {
		System.out.println("학년: " + grade);
		System.out.println("반: " + classroom);
		System.out.println("이름: " + name);
		System.out.println("키: " + height);
		System.out.println("성별: " + gender);
	}
	

}
