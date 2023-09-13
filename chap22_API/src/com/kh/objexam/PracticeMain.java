package com.kh.objexam;
import java.util.Scanner;

public class PracticeMain {

	public static void main(String[] args) {
		
		PracticeMain pm = new PracticeMain();
		pm.practice1();
	}
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 문자열 입력: ");
		String str1 = sc.nextLine();
		System.out.print("두 번째 문자열 입력: ");
		String str2 = sc.nextLine();
		
		if (str1.equals(str2)) {
			System.out.println("두 문자열은 같습니다.");
		} else System.out.println("두 문자열은 다릅니다");
		
		int hashCode1 = str1.hashCode();
		int hashCode2 = str2.hashCode();
		System.out.println("hashCode1 해시코드 : " + hashCode1);
		System.out.println("hashCode2 해시코드: " + hashCode2);
		
		String str1String = str1.toString();
		String str2String = str2.toString();
		System.out.println("첫 번째 문자열: " + str1String);
		System.out.println("두 번째 문자열: " + str2String);
		
		
	}

}
