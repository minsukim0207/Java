package com.kh.practice3.func;
import java.util.Scanner;

public class SwitchPractice1 {

	public static void main(String[] args) {
		/*
		 * 1. �Է�
		 * 2. ����
		 * 3. ��ȸ
		 * 4. ����
		 * 7. ����
		 */
		
		int choice;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�޴��� �����ϼ���.");
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");
		
		choice = sc.nextInt();
		
		switch (choice) {
			case 1:
				System.out.println("�Է� �޴��Դϴ�.");
				break;
			case 2:
				System.out.println("���� �޴��Դϴ�.");
				break;
			case 3:
				System.out.println("��ȸ �޴��Դϴ�.");
				break;
			case 4:
				System.out.println("���� �޴��Դϴ�.");
				break;
			case 7:
				System.out.println("���� �޴��Դϴ�.");
				break;
			default :
				System.out.println("���� �޴��Դϴ�.");
		}
	}

}
