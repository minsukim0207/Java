package com.kh.practice1.func;
import java.util.Scanner;

public class VariablePractice4 {
	//영어 문자열을 입력받아 앞 세 문자만 출력
	public static void main(String[] args) {
		String str;
		char c1, c2, c3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요: ");
		str = sc.next();
		
		c1 = str.charAt(0);
		c2 = str.charAt(1);
		c3 = str.charAt(2);
		
		
		System.out.println("첫번째 문자는: " + c1);
		System.out.println("두번째 문자는: " + c2);
		System.out.println("세번째 문자는: " + c3);
	}

}
