package com.kh.practice1.func;
import java.util.Scanner;

public class VariablePractice1 {
	//�̸�, ����, ����, Ű�� �Է¹ް� ���
	public static void main(String[] args) {
		String name, sex;
		int age, height;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ���: ");
		name = sc.next();
		
		System.out.print("������ �Է��ϼ���: ");
		sex = sc.next();
		
		System.out.print("���̸� �Է��ϼ���: ");
		age = sc.nextInt();
		
		System.out.print("Ű�� �Է��ϼ���: ");
		height = sc.nextInt();
		
		System.out.println("�̸�: " + name);
		System.out.println("����: " + sex);
		System.out.println("����: " + age);
		System.out.println("Ű: " + height);
	}
}