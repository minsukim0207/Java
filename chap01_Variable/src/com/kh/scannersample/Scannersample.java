package com.kh.scannersample;
import java.util.Scanner;

public class Scannersample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요.");
		int age = sc.nextInt(); //정수만 받는 next
		
		System.out.println("내 나이는 " + age + "세 입니다.");
		
		String name;
		int phoneNumber;
		
		System.out.print("당신의 이름을 입력하세요: ");
		name = sc.next();
		System.out.print("당신의 전화번호를 입력하세요: ");
		phoneNumber = sc.nextInt();
		
		System.out.println("당신의 이름은 " + name + "입니다.");
		System.out.println("당신의 전화번호는 " + phoneNumber + "입니다.");
		
		//취미, 좋아하는 음식, 주소 입력받아서 출력하기
		String hobby, favoriteFood, homeAddress;
		System.out.print("당신의 취미를 입력하세요.: ");
		hobby = sc.next();
		
		System.out.print("당신이 좋아하는 음식을 입력하세요.: ");
		favoriteFood = sc.next();
		
		System.out.print("당신의 주소를 입력하세요: ");
		homeAddress = sc.next();
		
		System.out.println("당신의 취미는 " + hobby + "입니다.");
		System.out.println("당신이 좋아하는 음식은 " + favoriteFood + "입니다.");
		System.out.println("당신의 주소는 " + homeAddress + "입니다.");
	}
}
