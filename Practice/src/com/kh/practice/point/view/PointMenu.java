package com.kh.practice.point.view;
import com.kh.practice.point.controller.*;
import java.util.Scanner;

public class PointMenu {
	
	Scanner sc = new Scanner(System.in);
	
	CircleController cc = new CircleController();
	
	RectangleController rc = new RectangleController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("====== 메뉴 ======");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			
			System.out.print("메뉴 번호: ");
		
			switch(sc.nextInt()) {
				case 1:
					circleMenu();
					break;
				case 2:
					rectangleMenu();
					break;
				case 9:
					System.exit(0);
					break;
				default :
					System.out.println("메뉴를 다시 선택해주세요.");
					continue;	
			}
		}
		
	}
	
	public void circleMenu() {
		
		while(true) {
			System.out.println("====== 메뉴 ======");
			System.out.println("1. 원 둘레");
			System.out.println("2. 원 넓이");
			System.out.println("9. 메인으로");
			
			System.out.print("메뉴 번호: ");
		
			switch(sc.nextInt()) {
				case 1:
					calcCircum();
					break;
				case 2:
					calcCircleArea();
					break;
				case 9:
					mainMenu();
					break;
				default :
					System.out.println("메뉴를 다시 선택해주세요.");
					continue;	
			}
		}
		
	}
	
	public void rectangleMenu() {
		
		while(true) {
			System.out.println("====== 메뉴 ======");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 넓이");
			System.out.println("9. 메인으로");
			
			System.out.print("메뉴 번호: ");
		
			switch(sc.nextInt()) {
				case 1:
					calcPerimeter();
					break;
				case 2:
					calcRectArea();
					break;
				case 9:
					mainMenu();
					break;
				default :
					System.out.println("메뉴를 다시 선택해주세요.");
					continue;	
			}
		}
		
	}
	
	public void calcCircum() {
		
		System.out.println(cc.calcCircum(1, 1, 1));
	}
	
	public void calcCircleArea() {
		
		System.out.println(cc.calcArea(1, 1, 1));
		
	}
	
	public void calcPerimeter() {
		
		System.out.println(rc.calcPerimeter(1, 1, 1, 1));
		
	}
	
	public void calcRectArea() {
		
		System.out.println(rc.calcArea(1, 1, 1, 1));

	}

}
