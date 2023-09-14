package com.kh.exceptionprac;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain m = new PracticeMain();
		//m.prac1();
		m.prac2();
		//m.prac3();
	}
	
	public void prac1() { // Arithmetic
		try {
			int dividend = 100;
			int divisor = 0;
			int result = dividend / divisor;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("산술 에러" + e.getMessage());
		}
	}
	
	public void prac2() { // Null Point
		try {
			String text = "Hello world";
			String subText = null;
			int length = text.indexOf(subText);
			System.out.println(length);
		} catch (NullPointerException e) {
			System.out.println("Null Point 에러" + e.getMessage());
		}
	}
	
	public void prac3() { // NumberFormat
		try {
			String text = "123.45";
			int number = Integer.parseInt(text);
			System.out.println(number);
		} catch (NumberFormatException e) {
			System.out.println("숫자 포맷 에러" + e.getMessage());
		}
	}

}
