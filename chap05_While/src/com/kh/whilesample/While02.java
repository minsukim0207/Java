package com.kh.whilesample;
import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		boolean isChoice = false;
		
		while (!isChoice) {
			System.out.println("월을 선택해 주세요.");
			
			int month = sc.nextInt();
			
			switch (month) {
				case 12: case 1: case 2:
					System.out.println("겨울");
					isChoice = true;
					break;
				case 3: case 4: case 5:
					System.out.println("봄");
					isChoice = true;
					break;
				case 6: case 7: case 8:
					System.out.println("여름");
					isChoice = true;
					break;
				case 9: case 10: case 11:
					System.out.println("가을");
					isChoice = true;
					break;
				default :
					System.out.println("잘못된 선택입니다.\n");	
			}
		}
		
		// 나이를 입력받아 성인, 청소년, 어린이로 분류하고 출력
		
		while (!isChoice) {
			System.out.println("나이를 입력해주세요.");
			
			int age = sc.nextInt();
			
			switch (age) {
				case 19: case 20:
					System.out.println("성인입니다.");
					isChoice = true;
					break;
				case 14: case 15: case 16: case 17: case 18:
					System.out.println("청소년입니다.");
					isChoice = true;
					break;
				case 10: case 11: case 12: case 13:
					System.out.println("어린이입니다.");
					isChoice = true;
					break;
				default :
					System.out.println("다시 입력하세요.");
			}
		}
	}

}
