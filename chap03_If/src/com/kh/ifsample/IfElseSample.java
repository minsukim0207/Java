package com.kh.ifsample;

public class IfElseSample {

	public static void main(String[] args) {
		// if-else
		/*
		 * 프로그램 조건에 따라 두 가지 서로 다른 코드 블록 중 하나를 실행
		 * 만약 if 문의 조건이 참이면 if 내에 있는 블록이 실행
		 * 조건이 거짓이면 else 블록이 실행
		 * 이를 통해 두 가지 상황에 따라 다른 동작을 수행할 수 있다
		 */
		
		int age = 60;
		
		if (age >= 60) {
			System.out.println("환갑 잔치");
		} else {
			System.out.println("노동");
		}
		
		int temp = 30;
		
		if (temp >= 25) {
			System.out.println("여름");
		} else {
			System.out.println("적당한 날씨");
		}
		
	}

}
