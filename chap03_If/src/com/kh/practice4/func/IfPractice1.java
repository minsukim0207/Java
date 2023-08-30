package com.kh.practice4.func;
import java.util.Scanner;

public class IfPractice1 {

	public static void main(String[] args) {
		// 입력 받은 정수가 양수이면서 짝수일 경우 "짝수다" 출력
		// 짝수가 아니면 "홀수다" 출력
		// 양수가 아니면 "양수만 입력해주세요." 출력
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		System.out.println("정수를 입력해주세요.");
		
		number = sc.nextInt();
		
		if (number >= 0 && number % 2 == 0) {
			System.out.println("짝수다");
		} else if (number >= 0 && number % 2 != 0) {
			System.out.println("홀수다");
		} else {
			System.out.println("양수만 입력해주세요.");
		}
		
	}

}
