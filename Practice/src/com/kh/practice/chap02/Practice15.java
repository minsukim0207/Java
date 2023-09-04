package com.kh.practice.chap02;
import java.util.Scanner;

public class Practice15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		System.out.print("숫자를 입력하세요: ");
		int inputNum = sc.nextInt();
		
		if (inputNum < 2) {
			System.out.println("잘못 입력하셨습니다.");		
		} else {
			for (int i = 2; i <= inputNum; i++) {
				for (int j = 2; j <= i; j++) {
					if (i / j == i) {
						count = 1;
					} else continue;
				}
			}
			if (count == 1) System.out.println(inputNum + "은 소수입니다.");
		}
	}
}