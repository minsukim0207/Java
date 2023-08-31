package com.kh.practice.chap02;
import java.util.Scanner;

public class Practice9 {

	public static void main(String[] args) {
		// 입력받은 숫자의 단부터 9단까지 출력
		// 9를 초과하는 숫자를 입력받으면 "9이하의 숫자만 입력하세요." 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 9까지의 숫자를 입력해주세요.");
		
		
		while(true) {

			int num = sc.nextInt();
			
			if (num < 1 || num > 9) {
				System.out.println("1부터 9까지의 숫자를 입력해주세요.");
				continue;
			} else {
				for (int i = num; i <= 9; i++) {
					for (int m = 1; m <= 9; m++) {
						System.out.println(i + " * " + m + " = " + i * m);
					}
				} break;
			}
		}
	}

}
