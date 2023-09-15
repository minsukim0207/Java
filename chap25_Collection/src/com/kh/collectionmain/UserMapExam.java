package com.kh.collectionmain;

import java.util.HashMap;
import java.util.Map;

public class UserMapExam {

	public static void main(String[] args) {
		Map<String, Integer> userMap = new HashMap<>();
		
		// ���� �߰�
		userMap.put("Kim", 20);
		userMap.put("Lee", 21);
		userMap.put("Park", 22);
		
		// Ư�� ���� �˻�
		String searchName = "Kim";
		if (userMap.containsKey(searchName)) {
			int age = userMap.get(searchName);
			System.out.println(searchName + "�� ����" + age);
		} else {
			System.out.println(searchName + "�� ���̸� ã�� �� �����ϴ�.");
		}
		
		// ��ü ���
		for (Map.Entry<String, Integer> entry : userMap.entrySet()) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.println(name + " : " + age);
		}
		
		// Ư�� ���� ����
		String userUpdate = "Kim";
		int newAge = 23;
		userMap.put(userUpdate, newAge);
		System.out.println(userMap + "�� ���̸� " + newAge + "�� �����߽��ϴ�.");
		
		// Ư�� ���� ����
		String removeUser = "Park";
		userMap.remove(removeUser);
		System.out.println(removeUser + "�� �����߽��ϴ�.");
		
		// ��ü ���
		for (Map.Entry<String, Integer> entry : userMap.entrySet()) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.println(name + " : " + age);
		}
	}

}
