package com.kh.practice1.func;
import java.util.Scanner;

public class VariablePractice2 {
	//두 정수를 입력 받아 합, 차, 곱, 나누기한 몫 출력
	public static void main(String[] args) {
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자1을 입력하세요: ");
		num1 = sc.nextInt();
		
		System.out.print("숫자2를 입력하세요: ");
		num2 = sc.nextInt();
		
		System.out.println("두 수의 합은: " + (num1 + num2));
		System.out.println("두 수의 차는: " + (num1 - num2));
		System.out.println("두 수의 곱은: " + (num1 * num2));
		System.out.println("두 수의 나누기 몫은: " + (num1 / num2));
	}

}
