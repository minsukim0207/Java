package com.kh.arraysample;

public class Array02 {

	public static void main(String[] args) {
		// 1. 배열의 길이를 선언
		// 1~10까지의 반복문을 이용해서 순서대로 배열 인덱스에 넣은 후 그 값을 출력
		/*
		int[] num = new int[10];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		*/
		int[] num = new int[10];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = num.length - i;
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		// 2. 길이가 5인 String 배열 선언
		// 사과, 귤, 포도, 복숭아, 참외 로 초기화한 후 배열 인덱스를 활용해서 귤 출력
		
		String[] fruit = {"사과", "귤", "포도", "복숭아", "참외"};
		
		System.out.println(fruit[1]);
	}

}
