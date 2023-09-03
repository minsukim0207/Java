package com.kh.practice.assignment;
import java.util.Scanner;

public class Assignment01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 간단 계산기");
		System.out.println("2. 작은 수에서 큰 수까지 합계");
		System.out.println("3. 신상 정보 확인");
		System.out.println("4. 학생 정보 확인");
		System.out.println("5. 별과 숫자 출력");
		System.out.println("6. 난수까지의 합계");
		System.out.println("7. 구구단");
		System.out.println("8. 주사위 숫자 알아맞추기");
		System.out.println("9. 프로그램 종료");
		
		System.out.print("메뉴 번호: ");
		int menuNum = sc.nextInt();
		
		while (true) {
			switch (menuNum) {
				case 1:
					calculator();
					break;
				case 2:
					totalCalculator();
					break;
				case 3:
					printProfile();
					break;
				case 4:
					printScore();
					break;
				case 5:
					printStarNumber();
					break;
				case 6:
					sumRandom();
					break;
				case 7:
					exceptGugu();
					break;
				case 8:
					diceGame();
					break;
				case 9:
					System.out.println("종료합니다.");
					break;
				default :
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	private static void calculator() {
		
	}
	
	private static void totalCalculator() {
		
	}
	
	private static void printProfile() {
		
	}
	
	private static void printScore() {
		
	}
	
	private static void printStarNumber() {
		
	}
	
	private static void sumRandom() {
		
	}
	
	private static void exceptGugu() {
		
	}
	
	private static void diceGame() {
		
	}
}