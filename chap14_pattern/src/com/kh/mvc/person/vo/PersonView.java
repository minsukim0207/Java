package com.kh.mvc.person.vo;
import java.util.Scanner;

public class PersonView {

	Scanner sc = new Scanner(System.in);
	
	public String inputName() {
		System.out.print("�̸��� �Է��ϼ���: ");
		return sc.next();
	}
	
	public void displayInfo(String name) {
		System.out.println("�̸�: " + name);
	}
}
