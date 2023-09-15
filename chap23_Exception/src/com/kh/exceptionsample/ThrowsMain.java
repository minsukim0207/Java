package com.kh.exceptionsample;
import java.util.Scanner;

public class ThrowsMain {
/*
 * ���� �߻� Ű����
 * ���ܸ� �߻���Ű�� ���� ó���� ���۵ǰ� ���α׷��� �ش� ���ܸ� ������ ó���ϰų� ���� ȣ�� ���� ���ܸ� ����
 */
	public static void main(String[] args) {
		
		try {
			int number = getNumber();
			if (number < 0) {
				throw new NegativeNumberException("������ ������ �ʽ��ϴ�.");
			}
			System.out.println("�Է��� ����: " + number);
		} catch (NegativeNumberException e) {
			System.out.println("���� �߻� " + e.getMessage());
		}
	}
	
	public static int getNumber() {
		// ���� �Է� �� ���� �߻�
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���: ");
		int number = sc.nextInt();
		return number;
	}
}