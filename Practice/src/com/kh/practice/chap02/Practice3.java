package com.kh.practice.chap02;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		// �Է¹��� ������ 1���� �Ųٷ� ���
		// �Է��� 1 �̻�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 �̻��� ������ �Է����ּ���.");
		
		int input = sc.nextInt();
		
		if (input < 1) {
			System.out.println("1 �̻��� ������ �Է����ּ���.");
		} else {
			for (int i = input; i >= 1; i--) {
				System.out.println(i);
			}
		}
	}

}