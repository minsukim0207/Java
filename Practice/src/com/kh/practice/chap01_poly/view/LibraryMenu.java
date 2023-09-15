package com.kh.practice.chap01_poly.view;
import com.kh.practice.chap01_poly.controller.*;
import com.kh.practice.chap01_poly.model.vo.*;

import java.util.Scanner;

public class LibraryMenu {
	
	private LibraryController lc = new LibraryController();

	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		char gender = sc.next().charAt(0);
		sc.nextLine();
		
		Member member = new Member(name, age, gender);
		
		System.out.println(lc.bList[1]);
	}
	
	public void selectAll() {
		Book[] bList = lc.selectAll();
		
		for (int i = 0; i < bList.length; i++) {
			System.out.println(i + "번 도서: " + bList[i].toString());
		}
	}
	
	public void searchBook() {
		System.out.print("검색할 제목 키워드 입력: ");
		String keyword = sc.nextLine();
		
		Book[] searchList = lc.searchBook(keyword);
		System.out.println(searchList);
	}
	
	public void rentBook() {
		lc.selectAll();
		
		System.out.print("대여할 도서 번호 선택: ");
		int result = lc.rentBook(sc.nextInt());
		
		if (result == 0) {
			System.out.println("성공적으로 대여되었습니다.");
		} else if (result == 1) {
			System.out.println("나이 제한으로 대여 불가능입니다.");
		} else {
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
		}
	}
}
