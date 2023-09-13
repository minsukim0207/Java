package com.kh.api.exam1;

public class WrapperMain {
/*
 * Wrapper
 * �⺻ ������ ������ ��ü�� wrapping
 * ��ü�� �۾��� �� ����
 * Ŭ�����δ� Integer, Double, Boolean ���� ����
 */
	public static void main(String[] args) {
		
		Integer num = 40;
		System.out.println("������: " + num);
		
		// Wrapper Ŭ������ �⺻ ������ �������� ��ȯ
		int intValue = num.intValue();
		System.out.println("�⺻ ������ ���� ��: " + intValue);
		
		Double pi = 3.1415;
		double radius = 5.0;
		double area = pi * Math.pow(radius, 2);
		System.out.println("���� ����: " + area);
		
		// ���ڿ��� �Ǽ��� ��ȯ
		String numStr = "3.14";
		Double parsedDouble = Double.parseDouble(numStr);
		// String �����͸� ����, �Ҽ��� ��ȯ
		System.out.println("���ڿ��� �Ǽ��� ��ȯ�� ��: " + parsedDouble);

		// Boolean Wrapper Ŭ����
		Boolean isJavaFun = true;
		
		// ���ǹ� Ȱ��
		if (isJavaFun) {
			System.out.println("�ڹٴ� ��մ�");
		} else {
			System.out.println("�ڹ� ����");
		}
		
		String boolStr = "true";
		Boolean parseBool = Boolean.parseBoolean(boolStr);
		System.out.println("���ڿ��� Boolean���� ��ȯ�� ��: " + parseBool);
	}

}
