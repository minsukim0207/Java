package com.kh.scannersample;
import java.util.Scanner;

public class Scannersample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���̸� �Է����ּ���.");
		int age = sc.nextInt(); //������ �޴� next
		
		System.out.println("�� ���̴� " + age + "�� �Դϴ�.");
		
		String name;
		int phoneNumber;
		
		System.out.print("����� �̸��� �Է��ϼ���: ");
		name = sc.next();
		System.out.print("����� ��ȭ��ȣ�� �Է��ϼ���: ");
		phoneNumber = sc.nextInt();
		
		System.out.println("����� �̸��� " + name + "�Դϴ�.");
		System.out.println("����� ��ȭ��ȣ�� " + phoneNumber + "�Դϴ�.");
		
		//���, �����ϴ� ����, �ּ� �Է¹޾Ƽ� ����ϱ�
		String hobby, favoriteFood, homeAddress;
		System.out.print("����� ��̸� �Է��ϼ���.: ");
		hobby = sc.next();
		
		System.out.print("����� �����ϴ� ������ �Է��ϼ���.: ");
		favoriteFood = sc.next();
		
		System.out.print("����� �ּҸ� �Է��ϼ���: ");
		homeAddress = sc.next();
		
		System.out.println("����� ��̴� " + hobby + "�Դϴ�.");
		System.out.println("����� �����ϴ� ������ " + favoriteFood + "�Դϴ�.");
		System.out.println("����� �ּҴ� " + homeAddress + "�Դϴ�.");
	}
}