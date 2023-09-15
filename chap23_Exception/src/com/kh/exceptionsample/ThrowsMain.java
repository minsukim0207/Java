package com.kh.exceptionsample;
import java.util.Scanner;

public class ThrowsMain {
/*
 * 예외 발생 키워드
 * 예외를 발생시키면 예외 처리가 시작되고 프로그램은 해당 예외를 적절히 처리하거나 상휘 호출 스택 예외를 전파
 */
	public static void main(String[] args) {
		
		try {
			int number = getNumber();
			if (number < 0) {
				throw new NegativeNumberException("음수는 허용되지 않습니다.");
			}
			System.out.println("입력한 숫자: " + number);
		} catch (NegativeNumberException e) {
			System.out.println("예외 발생 " + e.getMessage());
		}
	}
	
	public static int getNumber() {
		// 음수 입력 시 예외 발생
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int number = sc.nextInt();
		return number;
	}
}