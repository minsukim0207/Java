package com.kh.practice;

import java.util.HashMap;
import java.util.Map;

public class UserExam {

	public static void main(String[] args) {
		Map<String, Integer> user = new HashMap<>();
		
		user.put("ȫ�浿", 19);
		user.put("�̼���", 20);
		user.put("��μ�", 21);
		
		String searchName = "�̼���";
		if (user.containsKey(searchName)) {
			int age = user.get(searchName);
			System.out.println(searchName + "�� ����: " + age);
		} else {
			System.out.println(searchName + "�� ã�� �� �����ϴ�.");
		}
		/*
		int searchAge = 21;
		if (user.containsValue(searchAge)) {
			String name = user.get
			System.out.println( "�� ����: " + searchAge);
		} else {
			System.out.println(searchAge + " ���̸� ã�� �� �����ϴ�.");
		}
		*/
	}

}
