package com.kh.whilesample;

public class While04 {

	public static void main(String[] args) {
		// 1���� 100���� ��
		
		int i = 1;
		int sum = 0;
		
		while (i <= 100) {
			sum += i;
			i++;
			// System.out.println(sum);
			// sum�� �հ踦 �ֱ������� ���� ������ while�� �ȿ� �ۼ�
		}
		
		System.out.println(sum);
		// while ����� Ŭ���� ����� ����
	}

}
