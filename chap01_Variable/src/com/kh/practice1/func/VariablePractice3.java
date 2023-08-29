package com.kh.practice1.func;
import java.util.Scanner;

public class VariablePractice3 {
	//키보드로 가로, 세로 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 출력
	public static void main(String[] args) {
		double width, height, area, round;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 길이를 입력하세요: ");
		width = sc.nextDouble();
		
		System.out.print("세로 길이를 입력하세요: ");
		height = sc.nextDouble();
		
		area = width * height;
		round = width * 2 + height * 2;
		
		System.out.println("사각형의 면적은 " + area + "입니다.");
		System.out.println("사각형의 둘레는 " + round + "입니다.");
	}
}
