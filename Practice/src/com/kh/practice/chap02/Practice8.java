package com.kh.practice.chap02;
import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
		// �Է¹޴� �ܼ��� ������ ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ϴ� �ܼ��� �Է����ּ���.");
		
		int num = sc.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}

}
