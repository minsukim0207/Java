package com.kh.variable;

public class VariableConversion {
	public static void main(String[] args) {
		//1. �ڵ� ����ȯ(�Ͻ��� ����ȯ, ������ ����ȯ)
		int intNum = 100;
		System.out.println(intNum);
		long longNum = intNum; //int�� long���� �ڵ� ����ȯ
		System.out.println(longNum);
		
		float floatNum = 3.14f;
		double doubleNum = floatNum; //float�� double�� �ڵ� ����ȯ
		
		// int -> long���� �� ��ȯ 2���� ����� ���
		int intNum1, intNum2;
		long longNum1, longNum2;
		intNum1 = 10;
		intNum2 = 20;
		longNum1 = intNum1;
		longNum2 = intNum2;
		System.out.println(longNum1);
		System.out.println(longNum2);
		
		// short -> int�� �� ��ȯ 1���� ����� ���
		short shortNum1 = 1;
		int intNum3 = shortNum1;
		System.out.println(intNum3);
		
		// float -> double�� �� ��ȯ 1���� ����� ���
		float floatNum1 = 2.54f;
		double doubleNum1 = floatNum1;
		System.out.println(doubleNum1);
		
		//2. ������ ����ȯ(���� ����ȯ)
		//long -> int
		long largeLong = 123456789012345L;
		System.out.println("LargeLong: " + largeLong);
		int largeInt = (int)largeLong;
		System.out.println(largeInt); //long�� int�� ���� ����ȯ �� ��� �Ϻ� �����Ͱ� �ҽǵȴ�.
		
		double largeDouble1 = 12345.6789;
		int intPart = (int) largeDouble1;
		System.out.println(intPart); //�Ǽ��� int�� ���� ����ȯ �� ���� ������ ����
		
		//���ڿ� ���� ���� ����ȯ 2�� ���
		//���ڴ� char charValue = 'Z'; -> int�� ����
		char charValue = 'Z';
		int charNum = (int) charValue;
		System.out.println(charNum);
		
		char charBalue = 'A';
		int numChar = charBalue;
		System.out.println(numChar);
		
		//double -> int�� ����ȯ�ϰ� ��� 1��
		double largeDouble = 1234567890.12345;
		int largeInt1 = (int) largeDouble;
		System.out.println(largeInt1);
		
		//int -> short�� ����ȯ�ϰ� ��� 1��
		int largeInt2 = 100;
		short shortNum = (short) largeInt2;
		System.out.println(shortNum);
	}
}