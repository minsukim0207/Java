package com.kh.practice;

import java.util.HashMap;
import java.util.Map;

public class UserExam {

	public static void main(String[] args) {
		Map<String, Integer> user = new HashMap<>();
		
		user.put("홍길동", 19);
		user.put("이순신", 20);
		user.put("김민수", 21);
		
		String searchName = "이순신";
		if (user.containsKey(searchName)) {
			int age = user.get(searchName);
			System.out.println(searchName + "의 나이: " + age);
		} else {
			System.out.println(searchName + "을 찾을 수 없습니다.");
		}
		/*
		int searchAge = 21;
		if (user.containsValue(searchAge)) {
			String name = user.get
			System.out.println( "의 나이: " + searchAge);
		} else {
			System.out.println(searchAge + " 나이를 찾을 수 없습니다.");
		}
		*/
	}

}
