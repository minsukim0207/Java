package com.kh.api.exam1;

public class FormatterMain {
/*
 * Formatter
 * ���ڿ��� ����ȭ
 * �ؽ�Ʈ ����� ���ϴ� ���Ŀ� �°� �������ϰ� ���� �� ����
 */
	public static void main(String[] args) {

		String name = "Kim";
		int age = 30;
		double salary = 50000.50;
		
		// Formatter ����Ͽ� ���ڿ��� ����ȭ
		String formatString = String.format("�̸�: %s, ����: %d, ����: %.2f", name, age, salary);
		System.out.println(formatString);

	}

}
