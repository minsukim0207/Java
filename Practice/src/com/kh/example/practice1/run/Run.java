package com.kh.example.practice1.run;
import com.kh.example.practice1.model.vo.*;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Member member = new Member("1234", "5678", "ȫ�浿", 20, '��', "01012345678", "gdh@gmail.com");
		
		member.printName();
		
		System.out.print("������ �̸��� �Է��ϼ���: ");
		
		member.changeName(sc.next());
		
		member.printName();
	}

}
