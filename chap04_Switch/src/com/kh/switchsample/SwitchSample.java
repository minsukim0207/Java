package com.kh.switchsample;

public class SwitchSample {

	public static void main(String[] args) {
		// Switch문
		// 특정 변수나 표현식의 값에 따라 다양한 경우를 처리하는 제어 구조
		// 일련의 Case문과 해당 값을 비교하여 일치하는 경우에 해당하는 코드 블록 실행
		// 각 Case문 뒤에는 일치하는 값이나 표현식이 나옴
	
		int day = 30;
		
		switch (day) {
			case 1:
				System.out.println("월요일");
				break;
			case 2:
				System.out.println("화요일");
				break;
			case 30:
				System.out.println("수요일");
				break;
			default :
				System.out.println("주말");
		}
		
		int choice = 1;
		
		switch (choice) {
			case 1:
				System.out.println("아메리카노");
				break;
			case 2:
				System.out.println("카페 라떼");
				break;
			case 3:
				System.out.println("아인슈페너");
				break;
			case 4:
				System.out.println("흑당버블티");
				break;
			default :
				System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
		}
	}

}
