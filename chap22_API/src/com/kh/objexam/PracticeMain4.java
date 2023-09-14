package com.kh.objexam;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PracticeMain4 {
	
	public void practice1() {
		
	}
	
	public void practice2() {
		
		Date currentDate = new Date();
		SimpleDateFormat smDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String formatStr = String.format("현재 날짜: %s", smDateFormat.format(currentDate));
		System.out.println(formatStr);
	}
	
	public void practice3() {
		int num1 = 123;
		int num2 = 7;
		
		String mStr = String.format("num1: %d, num2: %d",num1, num2);
		System.out.println(mStr);
	}
	
	public void practice4() {
		String text1 = "Hello";
		String text2 = "world";
		// 공백 채우기
		
		String formatStr = String.format("'%-10s' '%10s'", text1, text2);
		System.out.println(formatStr);
	}

	public static void main(String[] args) {
		
		PracticeMain4 p = new PracticeMain4();
		
		//p.practice1();
		//p.practice2();
		//p.practice3();
		p.practice4();
	}

}
