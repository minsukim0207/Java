package com.kh.practice.arraypractice;
import java.util.Scanner;

public class Practice9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] menu = {"후라이드", "양념", "간장", "마늘", "파닭", "반반"};
		
		System.out.print("치킨 이름을 입력하세요: ");
		String chicken = sc.next();
		
		for (int i = 0; i < menu.length; i++) {
			if (chicken.equals(menu[i])) {
				System.out.println(chicken + "메뉴 배달 가능");
				break;
			} else System.out.println(chicken + "메뉴 없음"); break;
		}
	}

}
