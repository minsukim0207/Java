package com.kh.practice.dimension;

public class DimensionPractice1 {
	
	public static void main(String[] args) {
	
		String[][] dimension = new String[3][3];
	
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				dimension[i][j] = "(" + i + ", " + j + ")";
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(dimension[i][j]);
			}
			System.out.println();
		}
	}
}
