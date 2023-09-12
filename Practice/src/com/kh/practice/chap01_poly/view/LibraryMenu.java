package com.kh.practice.chap01_poly.view;
import com.kh.practice.chap01_poly.controller.*;
import com.kh.practice.chap01_poly.model.vo.*;

import java.util.Scanner;

public class LibraryMenu {
	
	private LibraryController lc = new LibraryController();

	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		String name = sc.next();
		sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		char gender = sc.next().charAt(0);
		sc.nextLine();
		
		Member member = new Member(name, age, gender);
	}
	
	public void selectAll() {
		
	}
	
	public void searchBook() {
		
	}
	
	public void rentBook() {
		
	}
}
