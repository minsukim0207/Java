package com.kh.api.exam1;

public class FormatterMain {
/*
 * Formatter
 * 문자열을 형식화
 * 텍스트 출력을 원하는 형식에 맞게 포맷팅하고 싶을 때 유용
 */
	public static void main(String[] args) {

		String name = "Kim";
		int age = 30;
		double salary = 50000.50;
		
		// Formatter 사용하여 문자열을 형식화
		String formatString = String.format("이름: %s, 나이: %d, 월급: %.2f", name, age, salary);
		System.out.println(formatString);

	}

}
