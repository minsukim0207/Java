package com.kh.practice.arraypractice;
import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char[] numCopy = new char[14];
		
		System.out.print("주민등록번호: ");
		String numOrigin = sc.next();
		
		for (int i = 0; i < 14; i++) {
			if (i >= 8) {
				numCopy[i] = '*';
			} else {
			numCopy[i] = numOrigin.charAt(i);
			}
		}
		
		String convert = new String(numCopy);
		System.out.println(convert);
		
	}

}
