package com.kh.practice.chap02;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// 1�� ������ 1���� ���� ���� �Է� �� �ٽ� �Է� ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 �̻��� ������ �Է����ּ���.");
		
		while(true) {
		
			int input = sc.nextInt();
		
			if (input < 1) {
				System.out.println("1 �̻��� ������ �Է����ּ���.");
			} else {
				for (int i = 1; i <= input; i++) {
					System.out.println(i);
				}
			}
		}
	}
}