package com.kh.practice.dimension;

public class DimensionPractice6 {

	public static void main(String[] args) {
		
		String[][] strArr = new String[][] {
			{"��", "��", "��", "��", "��"},
			{"��", "��", "��", "��", "��"},
			{"��", "��", "��", "��", "��"},
			{"��", "��", "!", "��", "!!"}
		};
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(strArr[j][i] + " ");
			}
		}
	}

}
