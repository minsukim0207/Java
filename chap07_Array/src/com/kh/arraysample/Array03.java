package com.kh.arraysample;
import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		// ���ڿ� �Է¹޾Ƽ� ���� �ϳ��� �迭�� �ְ� �˻��� ���ڰ� ���ڿ��� �� �� �� 
		// �ִ��� ������ ���° �ε����� ��ġ�ϴ��� ���
		
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��ϼ���.");
		
		char[] inputString = sc.next().toCharArray();
		
		System.out.println("�˻��� ���ڸ� �Է��ϼ���.");
		
		char findChar = sc.next().charAt(0);
		
		for (int i = 0; i < inputString.length; i++) {
			if (inputString[i] == findChar) {
				System.out.println("��ġ�ϴ� �ε���: " + i);
				count++;
			} else continue;
		}
		
		System.out.println("��ġ�ϴ� �� ����: " + count);
		
		
	}

}
