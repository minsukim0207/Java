package com.kh.practice.dimension;
import java.util.Scanner;

public class DimensionPractice5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int row, column;
		
		while (true) {
			
			System.out.print("���� �Է��ϼ���: ");
			row = sc.nextInt();
			
			System.out.print("���� �Է��ϼ���: ");
			column = sc.nextInt();
		
			if (row < 1 || row > 10 || column < 1 || column > 10) {
				System.out.println("�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.");
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
		
		System.out.println("�� ũ��: " + row);
		System.out.println("�� ũ��: " + column);
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}
}