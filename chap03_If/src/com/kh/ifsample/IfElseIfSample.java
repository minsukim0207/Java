package com.kh.ifsample;

public class IfElseIfSample {
	public static void main(String[] args) {
		// if-else if-else
		/*
		 * ���� ���� ������ ���������� ��
		 * �� �� ù ��° ���� ���ǿ� �ش��ϴ� �ڵ� ����� ����
		 * ���� if�� else if�� ���ǵ� ���� �ƴ϶�� ������ else ��� ����
		 */
		
		int age = 20;
		
		if (age == 20) {
			System.out.println("�ؿ� ����");
		} else if (age > 20) {
			System.out.println("���� ����");
		} else {
			System.out.println("��");
		}
		
		int score = 85;
		
		if (score > 90) {
			System.out.println("A");
		} else if (score == 90) {
			System.out.println("B+");
		} else {
			System.out.println("B");
		}
		
		int hour = 15;
		
		if (hour < 12) {
			System.out.println("���� ��ħ");
		} else if (hour < 18) {
			System.out.println("������ �ڵ��մϴ�");
		} else {
			System.out.println("�����ϼ̽��ϴ�");
		}
		
		int temp = 28;
		
		if (temp > 30) {
			System.out.println("���� ����");
		} else if (temp > 20) {
			System.out.println("������ ����");
		} else {
			System.out.println("�߿� ����");
		}
		
		int number = -5;
		
		if (number > 0) {
			System.out.println("����Դϴ�.");
		} else if (number < 0) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("0�Դϴ�.");
		}
		
		// ���̰� 15�� �� û�ҳ����� ������� �������� ���
		int myAge = 15;
		
		if (myAge >= 18) {
			System.out.println("����");
		} else if (myAge >= 9) {
			System.out.println("û�ҳ�");
		} else {
			System.out.println("���");
		}
		
		//���� ����ϱ�
		int month = 8;

		if (month == 1 || month == 2 || month == 12) {
			System.out.println("�ܿ�");
		} else if (month >= 3 && month <= 5) {
			System.out.println("��");
		} else if (month >= 6 && month <= 8) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
	}

}
