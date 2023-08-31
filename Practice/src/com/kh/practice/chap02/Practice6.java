package com.kh.practice.chap02;
import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		// 두 수 입력받아 사이 숫자 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력해주세요.");
		int num1 = sc.nextInt();
		
		System.out.println("두번째 숫자를 입력해주세요.");
		int num2 = sc.nextInt();
		
		if (num2 >= num1) {
			for (int i = num1; i <= num2; i++) {
				System.out.println(i);
			}
		} else {
			for (int i = num2; i <= num1; i++) {
				System.out.println(i);
			}
		}
	}

}
