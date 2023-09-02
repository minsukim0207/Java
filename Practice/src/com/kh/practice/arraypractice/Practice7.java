package com.kh.practice.arraypractice;
import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
		
		int total = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요: ");
		int inputSize = sc.nextInt();
		
		int[] intArray = new int[inputSize];
		
		for (int i = 0; i < inputSize; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값: ");
			intArray[i] = sc.nextInt();
			total += intArray[i];
		}
		
		for (int i = 0; i < inputSize; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
		
		System.out.println("총 합: " + total);
	}

}
