package com.kh.practice.chap02;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// 1부터 입력받은 숫자까지 모두 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 이상의 정수를 입력해주세요.");
		
		int input = sc.nextInt();
		
		if (input < 1) {
			System.out.println("1 이상의 정수를 입력해주세요.");
		} else {
			for (int i = 1; i <= input; i++) {
				System.out.println(i);
			}
		}
	}

}
