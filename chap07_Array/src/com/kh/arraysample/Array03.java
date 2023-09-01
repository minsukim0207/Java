package com.kh.arraysample;
import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		// 문자열 입력받아서 문자 하나씩 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 
		// 있는지 개수와 몇번째 인덱스에 위치하는지 출력
		
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요.");
		
		char[] inputString = sc.next().toCharArray();
		
		System.out.println("검색할 문자를 입력하세요.");
		
		char findChar = sc.next().charAt(0);
		
		for (int i = 0; i < inputString.length; i++) {
			if (inputString[i] == findChar) {
				System.out.println("일치하는 인덱스: " + i);
				count++;
			} else continue;
		}
		
		System.out.println("일치하는 총 개수: " + count);
		
		
	}

}
