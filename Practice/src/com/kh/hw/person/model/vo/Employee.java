package com.kh.hw.person.model.vo;

public class Employee extends Person {

	private int salary;
	private String dept;
	
	public Employee() {
		
	}
	
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(name, age, height, weight);
		this.salary = salary;
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "이름: " + super.getName() + " 나이: " + super.getAge() + " 키: " + super.getHeight() + " 몸무게: " + super.getWeight() + " 급여: " + this.salary + " 부서: " + this.dept;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public String getDept() {
		return this.dept;
	}
}
