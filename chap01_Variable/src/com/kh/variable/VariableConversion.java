package com.kh.variable;

public class VariableConversion {
	public static void main(String[] args) {
		//1. 자동 형변환(암시적 형변환, 묵시적 형변환)
		int intNum = 100;
		System.out.println(intNum);
		long longNum = intNum; //int를 long으로 자동 형변환
		System.out.println(longNum);
		
		float floatNum = 3.14f;
		double doubleNum = floatNum; //float을 double로 자동 형변환
		
		// int -> long으로 형 변환 2가지 만들고 출력
		int intNum1, intNum2;
		long longNum1, longNum2;
		intNum1 = 10;
		intNum2 = 20;
		longNum1 = intNum1;
		longNum2 = intNum2;
		System.out.println(longNum1);
		System.out.println(longNum2);
		
		// short -> int로 형 변환 1가지 만들고 출력
		short shortNum1 = 1;
		int intNum3 = shortNum1;
		System.out.println(intNum3);
		
		// float -> double로 형 변환 1가지 만들고 출력
		float floatNum1 = 2.54f;
		double doubleNum1 = floatNum1;
		System.out.println(doubleNum1);
		
		//2. 명시적 형변환(강제 형변환)
		//long -> int
		long largeLong = 123456789012345L;
		System.out.println("LargeLong: " + largeLong);
		int largeInt = (int)largeLong;
		System.out.println(largeInt); //long을 int로 강제 형변환 할 경우 일부 데이터가 소실된다.
		
		double largeDouble1 = 12345.6789;
		int intPart = (int) largeDouble1;
		System.out.println(intPart); //실수를 int로 강제 형변환 할 때는 정수만 유지
		
		//문자와 숫자 간의 형변환 2개 출력
		//문자는 char charValue = 'Z'; -> int로 변경
		char charValue = 'Z';
		int charNum = (int) charValue;
		System.out.println(charNum);
		
		char charBalue = 'A';
		int numChar = charBalue;
		System.out.println(numChar);
		
		//double -> int로 형변환하고 출력 1개
		double largeDouble = 1234567890.12345;
		int largeInt1 = (int) largeDouble;
		System.out.println(largeInt1);
		
		//int -> short로 형변환하고 출력 1개
		int largeInt2 = 100;
		short shortNum = (short) largeInt2;
		System.out.println(shortNum);
	}
}
