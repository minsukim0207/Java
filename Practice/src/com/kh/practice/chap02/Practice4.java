package com.kh.practice.chap02;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		// 3���� �����ϳ� 1 �̸��� �Է��� ��� �ٽ� �ȳ�
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 �̻��� ������ �Է����ּ���.");
		
		while(true) {
			
			int input = sc.nextInt();
		
			if (input < 1) {
				System.out.println("1 �̻��� ������ �Է����ּ���.");
			} else {
				for (int i = input; i >= 1; i--) {
					System.out.println(i);
				} break;
			}
		}
	}
}

