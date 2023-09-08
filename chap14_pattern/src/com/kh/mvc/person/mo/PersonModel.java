package com.kh.mvc.person.mo;

public class PersonModel {
	
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void inValidName(String name) {
		// isEmpty, isBlack, equals, name.length < 0, null
		if () {
			System.out.println("입력값이 없습니다.");
		} else this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
