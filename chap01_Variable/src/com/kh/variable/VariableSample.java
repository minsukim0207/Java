package com.kh.variable;

public class VariableSample {
	public static void main(String[] args) {
		String name;
		name = "����";

		int hour = 15;
		double score = 90.5;
		char grade = 'A';
		System.out.println("�ȳ��ϼ���." + name + "�Դϴ�. ����" + hour + "�ÿ� ��۵˴ϴ�.");
		System.out.println("���� ������ " + score + "�Դϴ�.");
		System.out.println(score + "��" + grade + "�Դϴ�.");
		
		//������ �̸��� ���̿� �ڽ��� ����(double)�� �����ϰ� ����ϱ�.
		int myAge = 20;
		String myName = "��μ�";
		double myScore = 82.0;
		char myGrade = 'B';
		System.out.println("�ȳ��ϼ���. ���� �̸��� " + myName + "�̰�, ���̴� " + myAge + "�Դϴ�.");
		System.out.println("���� ������ " + myScore + "�̸�, ����� " + myGrade + "�Դϴ�.");
	}
}