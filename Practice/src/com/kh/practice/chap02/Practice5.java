package com.kh.practice.chap02;
import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		// 정수 입력 받아 1부터 입력 받은 정수까지 합 구하기
		// 1 이상의 정수 입력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 이상의 정수를 입력해주세요.");
		
		int input = sc.nextInt();
		
		int sum = 0;
		
		if (input < 1) {
			System.out.println("1 이상의 정수를 입력해주세요.");
		} else {
			for (int i = 1; i <= input; i++) {
				sum += i;
			}
			System.out.println("총합: " + sum);
		}
	}

}
