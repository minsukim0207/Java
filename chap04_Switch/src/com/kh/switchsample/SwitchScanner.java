package com.kh.switchsample;
import java.util.Scanner;

public class SwitchScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �������ּ���.");
		
		int fruit = sc.nextInt();
		
		switch (fruit) {
			case 1:
				System.out.println("���");
				break;
			case 2:
				System.out.println("����");
				break;
			default :
				System.out.println("�߸��� �����Դϴ�.");
		}
		
		System.out.println("�ֹ��Ͻ� ��ȣ�� �������ּ���.");
		System.out.println("1. �Ƹ޸�ī��");
		System.out.println("2. ������Ƽ");
		System.out.println("3. ���ν����");
		
		int choice = sc.nextInt();
		
		switch (choice) {
			case 1:
				System.out.println("�Ƹ޸�ī�� �ֹ�");
				break;
			case 2:
				System.out.println("������Ƽ �ֹ�");
				break;
			case 3:
				System.out.println("���ν���� �ֹ�");
				break;
			default :
				System.out.println("�߸��� �����Դϴ�. �ٽ� �������ּ���");
		}
		
		// Scanner�� �̿��ؼ� ���ڸ� �����ϴ� switch
		
		System.out.println("���ڸ� �������ּ���.");
		
		int crisps = sc.nextInt();
		
		switch (crisps) {
			case 1:
				System.out.println("�����");
				break;
			case 2:
				System.out.println("��īĨ");
				break;
			default :
				System.out.println("�߸��� �����Դϴ�. �ٽ� �������ּ���.");
		}
	}

}
