package com.kh.practice.arraypractice;
import java.util.Scanner;

public class Practice15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int strlength;	// 출력할 문자 길이를 위한 변
		
		System.out.print("문자열: ");
		String str = sc.next();
		
		strlength = str.length();
		
		char[] strChar = new char[str.length()];
		
		for (int i = 0; i < str.length(); i++) { // 입력받은 문자열 배열로 변환
			strChar[i] = str.charAt(i);
		}
		
		for (int i = 1; i < strlength; i++) {
			for (int j = 0; j < i; j++) {
				if (strChar[j] == strChar[i]) { // 이전 인덱스의 값들 중 현재 인덱스 값과 같은 경우 확인
					int l = i + 1; 				// 다음 인덱스값 저장을 위한 변수
					for (int m = i; m < strlength - 1; m++) { // 현재 인덱스의 값에 다음 인덱스의 값 저장
						strChar[m] = strChar[l];
						l++;
					}
					strlength--; 				// 뒤 인덱스의 값을 앞 인덱스로 가져왔으므로 출력할 배열 길이 -1
				}
			}
		}
		
		System.out.print("문자열에 있는 문자: ");
		for (int i = 0; i < strlength; i++ ) {	// 중복된 문자 개수만큼 줄여서 출력
			System.out.print(strChar[i] + " ");
		}
		System.out.println();
		
		System.out.println("문자 개수: " + strlength);

	}

}
