package com.kh.example.practice.advancedfor;
import java.util.Scanner;

public class NumberTotal {

	public static void main(String[] args) {
		
		int total = 0;
		
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[5];
		
		System.out.println("숫자 5개 입력: ");
		
		for (int i = 0; i < 5; i++) {
			numbers[i] = sc.nextInt();
		}
		
		for (int number : numbers) {
			total += number;
		}
		
		System.out.println("총 합: " + total);
	}

}
