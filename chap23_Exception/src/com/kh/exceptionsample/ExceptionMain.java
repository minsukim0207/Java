package com.kh.exceptionsample;

public class ExceptionMain {

	public static void main(String[] args) {
		
		ExceptionMain exmain = new ExceptionMain();
		//exmain.ExceptionA();
		//exmain.ExceptionN();
		//exmain.ExceptionF();
		exmain.ExceptionExam();
	}
	
	public void ExceptionA() {
		try {
			int result = 10/0;
			System.out.println(result);
		} catch (ArithmeticException e) {
			/*
			 * ArithmeticException
			 * 산술 오류
			 * e는 변수
			 */
			System.out.println("산술 연산으로 인해 발생한 에러!" + e.getMessage());
		}
	}
	
	public void ExceptionN() {
		try {
			String text = null;
			int length = text.length();
			System.out.println(length);
		} catch (NullPointerException e) {
			System.out.println("Null Point 에러 발생 " + e.getMessage());
		}
	}
	
	public void ExceptionF() {
		try {
			String juminNum = "팔오공904";
			int num = Integer.parseInt(juminNum);
			System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력하세요." + e.getMessage());
		}
	}
	
	public void ExceptionExam() {
		try {
			int[] numbers = {1, 2, 3, 4, 5};
			int index = 7;
			int result = numbers[index];
			System.out.println(result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 범위를 벗어나 예외가 발생");
		} catch (Exception e) {
			System.out.println("배열 인덱스 범위를 벗어난 예외가 아닌 일반적인 다른 예외 발생");
		} finally {
			System.out.println("Finally");
		}
		System.out.println("프로그램 종료");
	}
}