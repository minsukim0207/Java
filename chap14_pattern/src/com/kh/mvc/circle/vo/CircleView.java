package com.kh.mvc.circle.vo;
import java.util.Scanner;

public class CircleView {

	public double getUserInput() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		
		return sc.nextInt();
	}
	
	public void displayResult(double result) {
		System.out.println("���: " + result);
	}
}
