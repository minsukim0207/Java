package com.kh.practice.chap02;
import java.util.Scanner;
import java.util.ArrayList;

public class Practice17 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int primeNum = 0;
		
		System.out.print("숫자를 입력하세요: ");
		int inputNum = sc.nextInt();
		
		if (inputNum > 2) {
			
			for (int i = 1; i <= inputNum; i++) {
				for (int j = 1; j <= i; j++) {
					if (i % j == 0) count++;
					else continue;
				}
		
				if (count == 2) {
					arrayList.add(i);
					primeNum++;
					count = 0;
				} else count = 0;
			}
			
			System.out.println(arrayList);
			System.out.println("2부터 " + inputNum + "까지의 소수는 " + primeNum + "개 입니다.");
		} else System.out.println("잘못 입력하셨습니다.");

	}

}
