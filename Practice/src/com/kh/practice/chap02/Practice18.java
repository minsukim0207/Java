package com.kh.practice.chap02;
import java.util.Scanner;
import java.util.ArrayList;

public class Practice18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		System.out.print("자연수 하나를 입력하세요: ");
		int inputNum = sc.nextInt();
		
		for (int i = 1; i <= inputNum; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				arrayList.add(i);
			}
			
			if (i % 6 == 0) count++;
		}
		
		System.out.println(arrayList);
		System.out.println("공배수의 개수: " + count);
		
	}

}
