package com.kh.objexam;
import java.util.Scanner;

public class PracticeMain {

	public static void main(String[] args) {
		
		PracticeMain pm = new PracticeMain();
		pm.practice1();
	}
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���ڿ� �Է�: ");
		String str1 = sc.nextLine();
		System.out.print("�� ��° ���ڿ� �Է�: ");
		String str2 = sc.nextLine();
		
		if (str1.equals(str2)) {
			System.out.println("�� ���ڿ��� �����ϴ�.");
		} else System.out.println("�� ���ڿ��� �ٸ��ϴ�");
		
		int hashCode1 = str1.hashCode();
		int hashCode2 = str2.hashCode();
		System.out.println("hashCode1 �ؽ��ڵ� : " + hashCode1);
		System.out.println("hashCode2 �ؽ��ڵ�: " + hashCode2);
		
		String str1String = str1.toString();
		String str2String = str2.toString();
		System.out.println("ù ��° ���ڿ�: " + str1String);
		System.out.println("�� ��° ���ڿ�: " + str2String);
		
		
	}

}
