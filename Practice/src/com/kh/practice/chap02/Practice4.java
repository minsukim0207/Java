package com.kh.practice.chap02;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		// 3번과 동일하나 1 미만을 입력할 경우 다시 안내
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 이상의 정수를 입력해주세요.");
		
		while(true) {
			
			int input = sc.nextInt();
		
			if (input < 1) {
				System.out.println("1 이상의 정수를 입력해주세요.");
			} else {
				for (int i = input; i >= 1; i--) {
					System.out.println(i);
				} break;
			}
		}
	}
}

