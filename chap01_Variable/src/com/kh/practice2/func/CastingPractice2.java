package com.kh.practice2.func;
import java.util.Scanner;

public class CastingPractice2 {
	//�Ǽ������� ����, ����, ���� ���� �Է� �޾� ������ ����� ���
	//������ ����� ���������� ���
	public static void main(String[] args) {
		double koreanScore, englishScore, mathScore;
		int sum, ave;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ������ �Է��ϼ���: ");
		koreanScore = sc.nextDouble();
		
		System.out.print("���� ������ �Է��ϼ���: ");
		englishScore = sc.nextDouble();
		
		System.out.print("���� ������ �Է��ϼ���: ");
		mathScore = sc.nextDouble();
		
		sum = (int) (koreanScore + englishScore + mathScore);
		ave = (int) (koreanScore + englishScore + mathScore)/3;
		
		System.out.println("����: " + sum);
		System.out.println("���: " + ave);
	}
	

}
