package com.kh.practice.arraypractice;

public class Practice13 {

	public static void main(String[] args) {
		
		int[] randomArray = new int[10];
		
		for (int i = 0; i < 10; i++) {
			if (i == 0) {
			randomArray[i] = (int) (Math.random() * 10);
			} else {
				randomArray[i] = (int) (Math.random() * 10);
				for (int j = 0; j < i; j++) {
					if (randomArray[j] == randomArray[i]) {
						i--;
					}
				}
			}
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.print(randomArray[i] + " ");
		}
	}
}