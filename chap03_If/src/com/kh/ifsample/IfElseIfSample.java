package com.kh.ifsample;
 
public class IfElseIfSample {
	public static void main(String[] args) {
		// if-else if-else
		/*
		 * 여러 개의 조건을 연속적으로 평가
		 * 그 중 첫 번째 참인 조건에 해당하는 코드 블록을 실행
		 * 만약 if나 else if의 조건도 참이 아니라면 마지막 else 블록 실행
		 */
		
		int age = 20;
		
		if (age == 20) {
			System.out.println("해외 여행");
		} else if (age > 20) {
			System.out.println("세계 여행");
		} else {
			System.out.println("집");
		}
		
		int score = 85;
		
		if (score > 90) {
			System.out.println("A");
		} else if (score == 90) {
			System.out.println("B+");
		} else {
			System.out.println("B");
		}
		
		int hour = 15;
		
		if (hour < 12) {
			System.out.println("좋은 아침");
		} else if (hour < 18) {
			System.out.println("열심히 코딩합니다");
		} else {
			System.out.println("수고하셨습니다");
		}
		
		int temp = 28;
		
		if (temp > 30) {
			System.out.println("더운 날씨");
		} else if (temp > 20) {
			System.out.println("적당한 날씨");
		} else {
			System.out.println("추운 날씨");
		}
		
		int number = -5;
		
		if (number > 0) {
			System.out.println("양수입니다.");
		} else if (number < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0입니다.");
		}
		
		// 나이가 15일 때 청소년인지 어린이인지 성인인지 출력
		int myAge = 15;
		
		if (myAge >= 18) {
			System.out.println("성인");
		} else if (myAge >= 9) {
			System.out.println("청소년");
		} else {
			System.out.println("어린이");
		}
		
		//계절 출력하기
		int month = 8;

		if (month == 1 || month == 2 || month == 12) {
			System.out.println("겨울");
		} else if (month >= 3 && month <= 5) {
			System.out.println("봄");
		} else if (month >= 6 && month <= 8) {
			System.out.println("여름");
		} else {
			System.out.println("가을");
		}
	}

}
