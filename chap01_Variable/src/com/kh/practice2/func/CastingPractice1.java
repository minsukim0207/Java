package com.kh.practice2.func;
import java.util.Scanner;

public class CastingPractice1 {
	//문자 입력 받아 그 문자의 숫자를 출력
	//아스키 코드
	public static void main(String[] args) {
		String str;
		char c;
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열를 입력하세요: ");
		str = sc.next(); //문자열을 입력 받음
		
		c = str.charAt(0); //문자열의 첫번째 문자 저장
		
		num = (int) c; //형변환
		
		System.out.println("해당 문자의 숫자는 " + num + "입니다.");
		
	}
}
