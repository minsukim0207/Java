package com.kh.practice2.func;
import java.util.Scanner;

public class CastingPractice1 {
	//���� �Է� �޾� �� ������ ���ڸ� ���
	//�ƽ�Ű �ڵ�
	public static void main(String[] args) {
		String str;
		char c;
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ���: ");
		str = sc.next(); //���ڿ��� �Է� ����
		
		c = str.charAt(0); //���ڿ��� ù��° ���� ����
		
		num = (int) c; //����ȯ
		
		System.out.println("�ش� ������ ���ڴ� " + num + "�Դϴ�.");
		
	}
}
