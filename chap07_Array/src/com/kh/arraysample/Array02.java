package com.kh.arraysample;

public class Array02 {

	public static void main(String[] args) {
		// 1. �迭�� ���̸� ����
		// 1~10������ �ݺ����� �̿��ؼ� ������� �迭 �ε����� ���� �� �� ���� ���
		/*
		int[] num = new int[10];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		*/
		int[] num = new int[10];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = num.length - i;
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		// 2. ���̰� 5�� String �迭 ����
		// ���, ��, ����, ������, ���� �� �ʱ�ȭ�� �� �迭 �ε����� Ȱ���ؼ� �� ���
		
		String[] fruit = {"���", "��", "����", "������", "����"};
		
		System.out.println(fruit[1]);
	}

}
