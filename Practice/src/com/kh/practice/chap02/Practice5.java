package com.kh.practice.chap02;
import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		// ���� �Է� �޾� 1���� �Է� ���� �������� �� ���ϱ�
		// 1 �̻��� ���� �Է�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 �̻��� ������ �Է����ּ���.");
		
		int input = sc.nextInt();
		
		int sum = 0;
		
		if (input < 1) {
			System.out.println("1 �̻��� ������ �Է����ּ���.");
		} else {
			for (int i = 1; i <= input; i++) {
				sum += i;
			}
			System.out.println("����: " + sum);
		}
	}

}
