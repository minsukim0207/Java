package com.kh.practice.arraypractice;
import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inputSize;
		int count = 1;
		
		while (true) {
			System.out.print("정수: ");
			inputSize = sc.nextInt();
			
			if (inputSize % 2 == 0 || inputSize < 3) {
				System.out.println("다시 입력하세요.");
				continue;
			} else {
				int[] intArray = new int[inputSize];
				
				for (int i = 0; i <= inputSize / 2; i++) {
					intArray[i] = count;
					count++;
				}
				
				count = count - 2;
				
				for (int i = inputSize / 2 + 1; i < inputSize; i++) {
					intArray[i] = count--;
				}
				
				for (int i = 0; i < inputSize; i++) {
					System.out.print(intArray[i] + " ");
				} break;
			}
		}
	}

}
