package com.kh.forsample;

public class For01 {

	public static void main(String[] args) {
		// For
		// �ݺ� �۾��� �����ϱ� ���� ���Ǵ� ���� ����
		// ��κ��� ���α׷��� ���� for���� ���� ����

		for (int i = 1; i <= 2; i++) {
			System.out.println(i);
		}
		
		for (int i = 0; i <= 5; i++) {
			System.out.println("i�� ��: " + i);
		}
		
		for (int i = 2; i <= 7; i++) {
			System.out.println("i�� ��: " + i);
		}
		
		for (int i = 10; i >= 5; i--) {
			System.out.println("i�� ��: " + i);
		}
		
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.println("1���� 10������ ��: " + sum);
		}
		
		// sum�� ���� 1���� 5������ ������ ���
		
		int total = 0;
		
		for (int i = 1; i <= 5; i++) {
			total += i;
			System.out.println("1���� 5������ ��: " + total);
		}

		int sum2 = 10;

		for (int i = 10; i >= 2; i--) {
			sum2 -= i;
			System.out.println("sum2: " + sum2);
		}
		
		int mul = 1;
		
		for (int i = 1; i <= 9; i++) {
			mul = 2 * i;
			System.out.println("mul: " + mul);
		}
	}

}
