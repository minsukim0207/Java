package com.kh.practice3.func;
import java.util.Scanner;

public class SwitchPractice2 {

	public static void main(String[] args) {
		// Switch������ ���� �Է¹޾� ���� ���
		
		Scanner sc = new Scanner(System.in);
		
		int month;
		
		System.out.println("���� �Է����ּ���.");
		
		month = sc.nextInt();
		
		switch (month) {
			case 1:
				System.out.println("�ܿ��Դϴ�.");
				break;
			case 2:
				System.out.println("�ܿ��Դϴ�.");
				break;
			case 3:
				System.out.println("���Դϴ�.");
				break;
			case 4:
				System.out.println("���Դϴ�.");
				break;
			case 5:
				System.out.println("���Դϴ�.");
				break;
			case 6:
				System.out.println("�����Դϴ�.");
				break;
			case 7:
				System.out.println("�����Դϴ�.");
				break;
			case 8:
				System.out.println("�����Դϴ�.");
				break;
			case 9:
				System.out.println("�����Դϴ�.");
				break;
			case 10:
				System.out.println("�����Դϴ�.");
				break;
			case 11:
				System.out.println("�����Դϴ�.");
				break;
			case 12:
				System.out.println("�ܿ��Դϴ�.");
				break;
			default :
				System.out.println("�߸��� �� �Է��Դϴ�.");
		}
	}

}
