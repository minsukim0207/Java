package com.kh.practice.dimension;
import java.util.Scanner;

public class DimensionPractice5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int row, column;
		
		while (true) {
			
			System.out.print("행을 입력하세요: ");
			row = sc.nextInt();
			
			System.out.print("열을 입력하세요: ");
			column = sc.nextInt();
		
			if (row < 1 || row > 10 || column < 1 || column > 10) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				continue;
			}
			else break;
		}
		
		char[][] arr = new char[row][column];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arr[i][j] = (char) (65 + (Math.random() * 25));
			}
		}
		
		System.out.println("행 크기: " + row);
		System.out.println("열 크기: " + column);
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}
}