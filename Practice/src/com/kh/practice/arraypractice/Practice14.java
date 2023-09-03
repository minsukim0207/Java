package com.kh.practice.arraypractice;

public class Practice14 {

	public static void main(String[] args) {
		
		int[] randomArray = new int[10];
		
		for (int i = 0; i < 10; i++) {
			if (i == 0) {
			randomArray[i] = (int) (Math.random() * 45);
			} else {
				randomArray[i] = (int) (Math.random() * 45);
				for (int j = 0; j < i; j++) {
					if (randomArray[j] == randomArray[i]) {
						i--;
					}
				}
			}
		}
		
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				if (randomArray[j] > randomArray[i]) {
					int temp = randomArray[j];
					randomArray[j] = randomArray[i];
					randomArray[i] = temp;
				}
			}
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.print(randomArray[i] + " ");
		}
	}

}
