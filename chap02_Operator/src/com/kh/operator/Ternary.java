package com.kh.operator;

public class Ternary {

	public static void main(String[] args) {
		// 6. ���� ������
		// ������ ���ϰ� �� ���� �� �� �ϳ��� ��ȯ
		// ���� ? ��1(True) : ��2(False)
		
		int age = 20;
		
		String status = (age >= 20) ? "����" : "�̼�����";
		
		System.out.println(status);
		
		int score = 85;
		
		String result = (score >= 60) ? "�հ�" : "���հ�";
		
		System.out.println("���� ���: " + result);
		
		int number = -5;
		
		String sign = (-5 > 0) ? "true" : "false";
		
		System.out.println("sigh: " + sign);
		
		int temperature = 25;
		
		String weather = (temperature > 21) ? "����" : "�߿�";
		
		System.out.println("����: " + weather);
		
		// ���� 7�� ���� ¦������ Ȧ������ ���
		
		int num = 7;
		
		String str = (num % 2 == 0) ? "¦��" : "Ȧ��";
		
		System.out.println("7�� ¦��?: " + str);
		
		int number2 = -5;
		
		String sign2 = (number2 > 0) ? "���" : (number2 < 0) ? "����" : "0";
		
		System.out.println(sign2);
	}

}