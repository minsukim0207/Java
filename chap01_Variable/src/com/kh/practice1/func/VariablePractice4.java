package com.kh.practice1.func;
import java.util.Scanner;

public class VariablePractice4 {
	//���� ���ڿ��� �Է¹޾� �� �� ���ڸ� ���
	public static void main(String[] args) {
		String str;
		char c1, c2, c3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ���: ");
		str = sc.next();
		
		c1 = str.charAt(0);
		c2 = str.charAt(1);
		c3 = str.charAt(2);
		
		
		System.out.println("ù��° ���ڴ�: " + c1);
		System.out.println("�ι�° ���ڴ�: " + c2);
		System.out.println("����° ���ڴ�: " + c3);
	}

}
