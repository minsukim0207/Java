package com.kh.practice.chap02;
import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		// �� �� �Է¹޾� ���� ���� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ���ڸ� �Է����ּ���.");
		int num1 = sc.nextInt();
		
		System.out.println("�ι�° ���ڸ� �Է����ּ���.");
		int num2 = sc.nextInt();
		
		if (num2 >= num1) {
			for (int i = num1; i <= num2; i++) {
				System.out.println(i);
			}
		} else {
			for (int i = num2; i <= num1; i++) {
				System.out.println(i);
			}
		}
	}

}
