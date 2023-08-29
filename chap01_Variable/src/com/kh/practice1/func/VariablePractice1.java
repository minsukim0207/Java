package com.kh.practice1.func;
import java.util.Scanner;

public class VariablePractice1 {
	//이름, 성별, 나이, 키를 입력받고 출력
	public static void main(String[] args) {
		String name, sex;
		int age, height;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		name = sc.next();
		
		System.out.print("성별을 입력하세요: ");
		sex = sc.next();
		
		System.out.print("나이를 입력하세요: ");
		age = sc.nextInt();
		
		System.out.print("키를 입력하세요: ");
		height = sc.nextInt();
		
		System.out.println("이름: " + name);
		System.out.println("성별: " + sex);
		System.out.println("나이: " + age);
		System.out.println("키: " + height);
	}
}
