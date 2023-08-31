package com.kh.forsample;
import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		// 구구단
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요.");
		
		int num1 = sc.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요.");
		
		int num2 = sc.nextInt();
		
		int result = 0;
		
		for (int i = 0; i < num2; i++) {
			// i 변수를 0부터 num2 미만까지 반복
			result += num1;
			System.out.println(num1 + " * " + num2 + " = " + result);
		}
		*/
		for (int i = 2; i <= 9; i++) {
			for (int m = 1; m <= 9; m++) {
				System.out.println(i + " * " + m + " = " + i*m);
			}
		}
	}

}
