package com.kh.scannersample;

import java.util.Scanner;

public class Scannerexam {
	//정수 두 개를 입력받아, 두 수의 합, 차, 곱, 나누기 한 몫과 나머지 출력
	public static void main(String[] args) {
		int iNum1 = 30;
		int iNum2 = 3;
		
		Scanner sc = new Scanner(System.in);
		
		int iNum3, iNum4;
		iNum3 = sc.nextInt();
		iNum4 = sc.nextInt();
		
		System.out.println(iNum1 - iNum2);
		
	}
}
