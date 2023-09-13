package com.kh.api.exam1;
import java.util.StringTokenizer;

public class StringTokenizerMain {
/*
 * StringTokenizer 클래스
 * 문자열을 분리하는데 사용
 * 주어진 구분자(기본:공백)를 기준으로 문자열을 토큰으로 분리
 */
	public static void main(String[] args) {
		
		StringTokenizerMain stTokenizer = new StringTokenizerMain();
		//stTokenizer.stExam5();
		stTokenizer.stringToMath();
		
	}
	
	public void stExam() {
		String text = "apple orange banana";
		
		StringTokenizer tokenizer = new StringTokenizer(text);
		
		// hasMoreTokenz
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			System.out.println(token);
		}
	}
	
	public void stExam2() {
		String text = "apple,banana,grape,orange";
		StringTokenizer tokenizer = new StringTokenizer(text, ",");
		
		while (tokenizer.hasMoreTokens()) {
			String fruit = tokenizer.nextToken();
			System.out.println(fruit);
		}
	}
	
	public void stExam3() {
		String text = "apple-banana-grape-orange";
		StringTokenizer tokenizer = new StringTokenizer(text, "-");
		
		while (tokenizer.hasMoreTokens()) {
			String fruit = tokenizer.nextToken();
			System.out.println(fruit);
		}
	}
	
	public void stExam4() {
		String text = "This is Sparta!!!!";
		StringTokenizer tokenizer = new StringTokenizer(text, " .");
		
		while (tokenizer.hasMoreTokens()) {
			String word = tokenizer.nextToken();
			if (!word.equals("Sparta")) {
				System.out.println(word);
			}
		}
	}
	
	public void stExam5() {
		String date = "2023-09-13";
		StringTokenizer tokenizer = new StringTokenizer(date, "-");
		int year = Integer.parseInt(tokenizer.nextToken());
		int month = Integer.parseInt(tokenizer.nextToken());
		int day = Integer.parseInt(tokenizer.nextToken());
		System.out.println("Year: " + year);
		System.out.println("Month: " + month);
		System.out.println("Day: " + day);
	}
	
	public void stringToMath() {
		String text = "The price is $15.99";
		StringTokenizer tokenizer = new StringTokenizer(text, "$.");
		
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			if (token.matches("\\d+(\\.\\d+)?")) {
				System.out.println("Number: " + token);
			}
		}
	}
}
