package com.kh.practice.arraypractice;
import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수: ");
		int inputSize = sc.nextInt();
		
		int[] inputArray = new int[inputSize];
		
		for (int i = 0; i < inputSize; i++) {
			inputArray[i] = i + 1;
		}
		
		for (int i = 0; i < inputSize; i++) {
			System.out.print(inputArray[i] + " ");
		}
	}

}
