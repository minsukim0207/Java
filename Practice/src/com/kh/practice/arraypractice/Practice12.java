package com.kh.practice.arraypractice;

import java.util.Arrays;

public class Practice12 {

	public static void main(String[] args) {
		
		int[] randomArray = new int[10];
		
		for (int i = 0; i < 10; i++) {
			randomArray[i] = (int) (Math.random() * 10);
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.print(randomArray[i] + " ");
		}
		System.out.println();
		
		System.out.println("최대값: " + Arrays.stream(randomArray).max().getAsInt());
		System.out.println("최소값: " + Arrays.stream(randomArray).min().getAsInt());
	}

}