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
		return "�̸�: " + super.getName() + " ����: " + super.getAge() + " Ű: " + super.getHeight() + " ������: " + super.getWeight() + " �޿�: " + this.salary + " �μ�: " + this.dept;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public String getDept() {
		return this.dept;
	}
}
