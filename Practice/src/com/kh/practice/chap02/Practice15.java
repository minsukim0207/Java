package com.kh.practice.chap02;
import java.util.Scanner;

public class Practice15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		System.out.print("숫자를 입력하세요: ");
		int inputNum = sc.nextInt();
		
		if (inputNum > 2) {
		
			for (int i = 1; i <= inputNum; i++) {
				if (inputNum % i == 0) count++;
				else continue;
			}
		
			if (count == 2) System.out.println(inputNum + "은 소수입니다.");
			else System.out.println(inputNum + "은 소수가 아닙니다.");
		} else System.out.println("잘못 입력하셨습니다.");
	}

}
