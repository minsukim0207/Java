package com.kh.practice.chap02;
import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
		// 입력받는 단수의 구구단 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하는 단수를 입력해주세요.");
		
		int num = sc.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}

}
