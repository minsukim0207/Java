package com.kh.practice4.func;
import java.util.Scanner;

public class IfPractice2 {

	public static void main(String[] args) {
		// ����, ����, ���� ���� �Է¹޾� ��� 60�� �̻��̸� �հ�
		
		Scanner sc = new Scanner(System.in);
		
		int koreanScore, englishScore, mathScore, sum, ave;
		
		System.out.println("�� ������ ������ �Է����ּ���.");
	
		System.out.print("���� ����: ");
		koreanScore = sc.nextInt();
		
		System.out.print("���� ����: ");
		englishScore = sc.nextInt();
		
		System.out.print("���� ����: ");
		mathScore = sc.nextInt();
		
		sum = koreanScore + englishScore + mathScore;
		ave = sum/3;
		
		if (ave < 60) {
			System.out.println("���հ��Դϴ�.");
		} else {
			System.out.println("���� ����: " + koreanScore);
			System.out.println("���� ����: " + englishScore);
			System.out.println("���� ����: " + mathScore);
			System.out.println("�� ����: " + sum);
			System.out.println("��� ����: " + ave);
			System.out.println("�հ��Դϴ�!");
		}	
	}

}
