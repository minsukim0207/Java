package com.kh.practice1.func;
import java.util.Scanner;

public class VariablePractice2 {
	//�� ������ �Է� �޾� ��, ��, ��, �������� �� ���
	public static void main(String[] args) {
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1�� �Է��ϼ���: ");
		num1 = sc.nextInt();
		
		System.out.print("����2�� �Է��ϼ���: ");
		num2 = sc.nextInt();
		
		System.out.println("�� ���� ����: " + (num1 + num2));
		System.out.println("�� ���� ����: " + (num1 - num2));
		System.out.println("�� ���� ����: " + (num1 * num2));
		System.out.println("�� ���� ������ ����: " + (num1 / num2));
	}

}