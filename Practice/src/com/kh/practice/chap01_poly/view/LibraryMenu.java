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
			System.out.println(i + "�� ����: " + bList[i].toString());
		}
	}
	
	public void searchBook() {
		System.out.print("�˻��� ���� Ű���� �Է�: ");
		String keyword = sc.nextLine();
		
		Book[] searchList = lc.searchBook(keyword);
		System.out.println(searchList);
	}
	
	public void rentBook() {
		lc.selectAll();
		
		System.out.print("�뿩�� ���� ��ȣ ����: ");
		int result = lc.rentBook(sc.nextInt());
		
		if (result == 0) {
			System.out.println("���������� �뿩�Ǿ����ϴ�.");
		} else if (result == 1) {
			System.out.println("���� �������� �뿩 �Ұ����Դϴ�.");
		} else {
			System.out.println("���������� �뿩�Ǿ����ϴ�. �丮�п� ������ �߱޵Ǿ����� �������������� Ȯ���ϼ���.");
		}
	}
}
