package com.kh.switchsample;
import java.util.Scanner;

public class SwitchCoffee {

	public static void main(String[] args) {
		// While문을 활용한 Switch
		
		Scanner sc = new Scanner(System.in);
		
		int choice;
		boolean isChoice = false;
		
		while(!isChoice) {
			
			System.out.println("커피를 선택해주세요. 1. 아메리카노 2. 카페라떼 3. 홍차");
			
			choice = sc.nextInt();
			
			switch (choice) {
				case 1:
					System.out.println("아메리카노 주문");
					isChoice = true;
					break;
				case 2:
					System.out.println("카페라떼 주문");
					isChoice = true;
					break;
				case 3:
					System.out.println("홍차 주문");
					isChoice = true;
					break;
				default :
					System.out.println("잘못된 선택입니다. 다시 선택해주세요");
			}
		}
	}

}
