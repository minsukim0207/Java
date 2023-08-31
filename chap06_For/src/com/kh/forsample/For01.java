package com.kh.forsample;

public class For01 {

	public static void main(String[] args) {
		// For
		// 반복 작업을 수행하기 위해 사용되는 제어 구조
		// 대부분의 프로그래밍 언어에서 for문이 가진 구조

		for (int i = 1; i <= 2; i++) {
			System.out.println(i);
		}
		
		for (int i = 0; i <= 5; i++) {
			System.out.println("i의 값: " + i);
		}
		
		for (int i = 2; i <= 7; i++) {
			System.out.println("i의 값: " + i);
		}
		
		for (int i = 10; i >= 5; i--) {
			System.out.println("i의 값: " + i);
		}
		
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.println("1부터 10까지의 합: " + sum);
		}
		
		// sum의 합이 1부터 5까지의 합으로 출력
		
		int total = 0;
		
		for (int i = 1; i <= 5; i++) {
			total += i;
			System.out.println("1부터 5까지의 합: " + total);
		}

		int sum2 = 10;

		for (int i = 10; i >= 2; i--) {
			sum2 -= i;
			System.out.println("sum2: " + sum2);
		}
		
		int mul = 1;
		
		for (int i = 1; i <= 9; i++) {
			mul = 2 * i;
			System.out.println("mul: " + mul);
		}
	}

}
