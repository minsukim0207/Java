package com.kh.pattern.mvc.view;

public class UserView {

	// 화면 출력
	public void displayInfo(String userName, int userAge) {
		
		System.out.println("학생 정보");
		System.out.println("이름: " + userName);
		System.out.println("나이: " + userAge);
	}
	
}
