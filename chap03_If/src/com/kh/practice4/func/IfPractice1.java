package com.kh.practice4.func;
import java.util.Scanner;

public class IfPractice1 {

	public static void main(String[] args) {
		// �Է� ���� ������ ����̸鼭 ¦���� ��� "¦����" ���
		// ¦���� �ƴϸ� "Ȧ����" ���
		// ����� �ƴϸ� "����� �Է����ּ���." ���
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		System.out.println("������ �Է����ּ���.");
		
		number = sc.nextInt();
		
		if (number >= 0 && number % 2 == 0) {
			System.out.println("¦����");
		} else if (number >= 0 && number % 2 != 0) {
			System.out.println("Ȧ����");
		} else {
			System.out.println("����� �Է����ּ���.");
		}
		
	}

}
