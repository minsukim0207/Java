package com.kh.mvc.person.mo;

public class PersonModel {
	
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void isValidName(String name) {
		// isEmpty, isBlack, equals, name.length < 0, null
		if (name == null || "".equals(name)) {
			System.out.println("�Է°��� �����ϴ�.");
			System.exit(0);
		} else this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
