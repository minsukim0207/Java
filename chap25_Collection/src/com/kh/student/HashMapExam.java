package com.kh.student;

import java.util.HashMap;
import java.util.Map;

public class HashMapExam {

	public static void main(String[] args) {
		// HashMap ����
		Map<String, Integer> studentGrades = new HashMap<>();
		
		// �л��� ���� �߰�
		studentGrades.put("KH", 95);
		studentGrades.put("Park", 80);
		studentGrades.put("David", 77);
		studentGrades.put("Bob", 90);
		
		// Ư�� �л��� ���� �˻�
		// containsKey : �ʿ��� Key, Value �� �ִ��� Ȯ��
		String studentName = "Bob";
		if (studentGrades.containsKey(studentName)) {
			int grade = studentGrades.get(studentName);
			System.out.println(studentName + "�� ����: " + grade);
		} else {
			System.out.println(studentName + "�� ������ ã�� �� �����ϴ�.");
		}
		
		// ��� �л��� ���� ���
		System.out.println("��ü �л� ����: ");
		for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name + ": " + grade);
		}
		
		// �л� ���� ����
		String studentUpdate = "Bob";
		int newGrade = 98;
		studentGrades.put(studentUpdate, newGrade);
		System.out.println(studentUpdate + "�� ������ " + newGrade + "�� �����߽��ϴ�.");
		
		String removeStudent = "David";
		studentGrades.remove(removeStudent);
		
		System.out.println(removeStudent + "�� ������ �����߽��ϴ�.");
		
		// ���� �л� ���� ���
		System.out.println("���� �л� ����: ");
		for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name = " : " + grade);
		}
	}
}
