package com.kh.practice1.func;
import java.util.Scanner;

public class VariablePractice3 {
	//Ű����� ����, ���� ���� �Ǽ������� �Է� �޾� �簢���� ������ �ѷ��� ���
	public static void main(String[] args) {
		double width, height, area, round;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���̸� �Է��ϼ���: ");
		width = sc.nextDouble();
		
		System.out.print("���� ���̸� �Է��ϼ���: ");
		height = sc.nextDouble();
		
		area = width * height;
		round = width * 2 + height * 2;
		
		System.out.println("�簢���� ������ " + area + "�Դϴ�.");
		System.out.println("�簢���� �ѷ��� " + round + "�Դϴ�.");
	}
}
