package com.kh.finalsample;
import java.util.Scanner;

public class JavaSample1 {

	public static void main(String[] args) {
		JavaSample1 js = new JavaSample1();
		js.inputText();
	
		System.out.println("���α׷� ����");
}
	public void inputText() {
		Scanner sc = new Scanner(System.in);
		boolean a = true;
		while (a) {
			System.out.println("���ڿ��� �Է����ּ���.");
			String str = sc.nextLine();
		
			if (str == "out") {
				break;
			} else {
				System.out.println(str.length());
			}
		}
	}
}