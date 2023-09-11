package com.kh.mvc.person.vo;
import java.util.Scanner;

public class PersonView {

	Scanner sc = new Scanner(System.in);
	
	public String inputName() {
		System.out.print("이름을 입력하세요: ");
		return sc.nextLine();
	}
	
	public void displayInfo(String name) {
		System.out.println("이름: " + name);
	}
}
