package com.kh.comparableprac;

public class Student implements Comparable<Student>{
	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Student otherPerson) {
		return this.age - otherPerson.age;
	}
	
	@Override
	public String toString() {
		return "Person name = " + name + ", age " + age;
	}
}
