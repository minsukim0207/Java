package com.kh.practice.chap02;
import java.util.Scanner;

public class Practice9 {

	public static void main(String[] args) {
		// �Է¹��� ������ �ܺ��� 9�ܱ��� ���
		// 9�� �ʰ��ϴ� ���ڸ� �Է¹����� "9������ ���ڸ� �Է��ϼ���." ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1���� 9������ ���ڸ� �Է����ּ���.");
		
		
		while(true) {

			int num = sc.nextInt();
			
			if (num < 1 || num > 9) {
				System.out.println("1���� 9������ ���ڸ� �Է����ּ���.");
				continue;
			} else {
				for (int i = num; i <= 9; i++) {
					for (int m = 1; m <= 9; m++) {
						System.out.println(i + " * " + m + " = " + i * m);
					}
				} break;
			}
		}
	}

}
