package com.kh.forsample;
import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		// ������
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		
		int num1 = sc.nextInt();
		
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		
		int num2 = sc.nextInt();
		
		int result = 0;
		
		for (int i = 0; i < num2; i++) {
			// i ������ 0���� num2 �̸����� �ݺ�
			result += num1;
			System.out.println(num1 + " * " + num2 + " = " + result);
		}
		*/
		for (int i = 2; i <= 9; i++) {
			for (int m = 1; m <= 9; m++) {
				System.out.println(i + " * " + m + " = " + i*m);
			}
		}
	}

}
