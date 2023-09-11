package com.kh.practice.student.view;
import com.kh.practice.student.controller.*;
import com.kh.practice.student.model.vo.*;

public class StudentMenu {

	private StudentController ssm = new StudentController();
	
	public StudentMenu() {
		System.out.println("======== �л� ���� ��� ========");
		Student[] stdArr = ssm.printStudent();
		for (int i = 0; i < stdArr.length; i++) {
			System.out.println(stdArr[i].inform());
		}
		System.out.println("======== �л� ���� ��� ========");
		double[] doubleArr = ssm.avgScore();
		System.out.println("�л� ���� �հ�: " + (int) doubleArr[0]);
		System.out.println("�л� ���� ���: " + doubleArr[1]);
		System.out.println("======== ���� ��� ��� ========");
		for (int i = 0; i < stdArr.length; i++) {
			if (stdArr[i].getScore() < StudentController.CUT_LINE) {
				System.out.println(stdArr[i].getName() + "�л��� ����� ����Դϴ�.");
			} else {
				System.out.println(stdArr[i].getName() + "�л��� ����Դϴ�.");
			}
		}
	}
}
