package com.kh.ifsample;

public class IfSample {

	public static void main(String[] args) {
		// 조건문
		/*
		 * if, else if, else 등의 문장을 사용해서 조건에 따라 다른 코드 블럭 실행
		 * 참일 경우 특정 코드 실행
		 * 거짓일 경우 다른 코드 실행
		 */
		
		int money = 300;
		
		if (money >= 200) {
			System.out.println("껌 구매");
		}
		
		int age = 18;
		
		if (age >= 18) {
			System.out.println("성인입니다.");
		}
		
		int temp = 25;
		
		if (temp > 24) {
			System.out.println("여름");
		}
	}

}
