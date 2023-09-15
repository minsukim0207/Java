package com.kh.collectionmain;

import java.util.HashMap;
import java.util.Map;

public class UserMapExam {

	public static void main(String[] args) {
		Map<String, Integer> userMap = new HashMap<>();
		
		// 유저 추가
		userMap.put("Kim", 20);
		userMap.put("Lee", 21);
		userMap.put("Park", 22);
		
		// 특정 유저 검색
		String searchName = "Kim";
		if (userMap.containsKey(searchName)) {
			int age = userMap.get(searchName);
			System.out.println(searchName + "의 나이" + age);
		} else {
			System.out.println(searchName + "의 나이를 찾을 수 없습니다.");
		}
		
		// 전체 출력
		for (Map.Entry<String, Integer> entry : userMap.entrySet()) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.println(name + " : " + age);
		}
		
		// 특정 유저 수정
		String userUpdate = "Kim";
		int newAge = 23;
		userMap.put(userUpdate, newAge);
		System.out.println(userMap + "의 나이를 " + newAge + "로 수정했습니다.");
		
		// 특정 유저 삭제
		String removeUser = "Park";
		userMap.remove(removeUser);
		System.out.println(removeUser + "를 삭제했습니다.");
		
		// 전체 출력
		for (Map.Entry<String, Integer> entry : userMap.entrySet()) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.println(name + " : " + age);
		}
	}

}
