package com.kh.arraysample;

public class TwoArray {

	public static void main(String[] args) {
		// 이중 문자열 배열 선언과 초기화
		String[][] fruits = {
				{"Apple", "Banana", "Cherry"},
				{"Grapes", "Orange", "Strawberry"},
				{"Kiwi", "Mango", "Pineapple"}
		};
		
		for (int i = 0; i < fruits.length; i++) {
			for (int a = 0; a < fruits[i].length; a++) {
				System.out.print(fruits[i][a] + " ");
			}
			System.out.println(); // 다음 행으로 이동하도록 Enter 용 출력 메서드 입력
		}
	}

}
