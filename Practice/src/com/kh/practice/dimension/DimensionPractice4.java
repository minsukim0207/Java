package com.kh.practice.dimension;

public class DimensionPractice4 {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[4][4];
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = (int) (Math.random() * 10);
				if (i == 0 && j == 3) {
					arr[i][j] = arr[0][0] + arr[0][1] + arr[0][2];
				} else if (i == 1 && j == 3) {
					arr[i][j] = arr[1][0] + arr[1][1] + arr[1][2];
				} else if (i == 2 && j == 3) {
					arr[i][j] = arr[2][0] + arr[2][1] + arr[2][2];
				} else if (i == 3 && j == 0) {
					arr[i][j] = arr[0][0] + arr[1][0] + arr[2][0];
				} else if (i == 3 && j == 1) {
					arr[i][j] = arr[0][1] + arr[1][1] + arr[2][1];
				} else if (i == 3 && j == 2) {
					arr[i][j] = arr[1][2] + arr[1][2] + arr[2][2];
				} else if (i == 3 && j == 3) {
					arr[i][j] = arr[0][3] + arr[1][3] + arr[2][3] + arr[3][0] + arr[3][1] + arr[3][2];
				}
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
