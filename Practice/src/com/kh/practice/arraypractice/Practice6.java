package com.kh.practice.arraypractice;
import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] week = {"일", "월", "화", "수", "목", "금", "토"};
		
		System.out.print("0~6 사이의 숫자를 입력하세요: ");
		int inputIndex = sc.nextInt();
		
		if (inputIndex >= 0 && inputIndex < 7) {
			System.out.println(week[inputIndex]);
		} else System.out.println("잘못된 입력입니다.");

	}

}
