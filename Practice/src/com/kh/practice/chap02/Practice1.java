package com.kh.practice.chap02;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// 1���� �Է¹��� ���ڱ��� ��� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 �̻��� ������ �Է����ּ���.");
		
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
