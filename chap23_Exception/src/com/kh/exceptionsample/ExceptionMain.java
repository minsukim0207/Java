package com.kh.exceptionsample;

public class ExceptionMain {

	public static void main(String[] args) {
		
		ExceptionMain exmain = new ExceptionMain();
		//exmain.ExceptionA();
		//exmain.ExceptionN();
		//exmain.ExceptionF();
		exmain.ExceptionExam();
	}
	
	public void ExceptionA() {
		try {
			int result = 10/0;
			System.out.println(result);
		} catch (ArithmeticException e) {
			/*
			 * ArithmeticException
			 * ��� ����
			 * e�� ����
			 */
			System.out.println("��� �������� ���� �߻��� ����!" + e.getMessage());
		}
	}
	
	public void ExceptionN() {
		try {
			String text = null;
			int length = text.length();
			System.out.println(length);
		} catch (NullPointerException e) {
			System.out.println("Null Point ���� �߻� " + e.getMessage());
		}
	}
	
	public void ExceptionF() {
		try {
			String juminNum = "�ȿ���904";
			int num = Integer.parseInt(juminNum);
			System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println("���ڸ� �Է��ϼ���." + e.getMessage());
		}
	}
	
	public void ExceptionExam() {
		try {
			int[] numbers = {1, 2, 3, 4, 5};
			int index = 7;
			int result = numbers[index];
			System.out.println(result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 �ε��� ������ ��� ���ܰ� �߻�");
		} catch (Exception e) {
			System.out.println("�迭 �ε��� ������ ��� ���ܰ� �ƴ� �Ϲ����� �ٸ� ���� �߻�");
		} finally {
			System.out.println("Finally");
		}
		System.out.println("���α׷� ����");
	}
}