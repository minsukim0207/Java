package com.kh.practice.arraypractice;
import java.util.Scanner;
import java.util.ArrayList;

public class Practice16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> arrayList = new ArrayList<>();
		
		System.out.print("배열의 크기를 입력하세요: ");
		int arraySize = sc.nextInt();
		
		for (int i = 1; i <= arraySize; i++) {
			System.out.print(i + "번째 문자열: ");
			arrayList.add(sc.next());
			sc.nextLine();
		}
		
		while(true) {
			System.out.print("더 값을 입력하시겠습니까? (Y/N) ");
			char answer = sc.next().charAt(0);
		
			if (answer == 'Y' || answer == 'y') {
				System.out.print("더 입력하고 싶은 개수: ");
				int addSize = sc.nextInt();
			
				for (int i = arraySize + 1; i <= arraySize + addSize; i++) {
					System.out.print(i + "번째 문자열: ");
					arrayList.add(sc.next());
					sc.nextLine();
				}
					arraySize += addSize;
			} else {
				System.out.println(arrayList);
				break;
			}
		}
	}

}
