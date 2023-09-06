package com.kh.inheritance.calculator;
import java.util.Scanner;

public class CalculatorRun extends CalculatorForMod{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		CalculatorRun cal = new CalculatorRun();
		
		System.out.print("첫 번째 숫자 입력: ");
		cal.num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 입력: ");
		cal.num2 = sc.nextInt();
		
		int result1 = cal.add();
		int result2 = cal.subtract();
		int result3 = cal.multiply();
		int result4 = cal.divide();
		int result5 = cal.mod();
		
		System.out.println("Add: " + result1);
		System.out.println("Subtrac: " + result2);
		System.out.println("Multiply: " + result3);
		System.out.println("Devide: " + result4);
		System.out.println("Mod: " + result5);
	}

}
