package com.kh.practice.chap02;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// 1번 문제에 1보다 낮은 정수 입력 시 다시 입력 받음
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 이상의 정수를 입력해주세요.");
		
		while(true) {
		
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
}