package com.kh.whilesample;
import java.util.Scanner;

public class While05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("5������ ������ �Է����ּ���.");
		
		int num = sc.nextInt();
		
		int sum = 0;
		
		while (sum <= 10) {
			sum += num;
			num++;
			
			System.out.println(sum);
			System.out.println(num);
		}
	}

}
