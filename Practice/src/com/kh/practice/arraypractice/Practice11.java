package com.kh.practice.arraypractice;

public class Practice11 {

	public static void main(String[] args) {
		
		int[] randomArray = new int[10];
		
		for (int i = 0; i < 10; i++) {
			randomArray[i] = (int) (Math.random() * 10);
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.print(randomArray[i] + " ");
		}
	}

}