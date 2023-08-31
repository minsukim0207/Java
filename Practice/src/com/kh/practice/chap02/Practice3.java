package com.kh.practice.chap02;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		// 입력받은 값부터 1까지 거꾸로 출력
		// 입력은 1 이상
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 이상의 정수를 입력해주세요.");
		
		int input = sc.nextInt();
		
		if (input < 1) {
			System.out.println("1 이상의 정수를 입력해주세요.");
		} else {
			for (int i = input; i >= 1; i--) {
				System.out.println(i);
			}
		}
	}

}
