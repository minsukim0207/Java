package com.kh.operator;

public class IncrementDecrement {

	public static void main(String[] args) {
		// 3. ���� ������ (Increment & Decrement)
		// ���� �����ڴ� ������ ���� 1�� ���� �Ǵ� ���ҽ�ų �� ���
		// ���� ���� ������(++x, --x)
		// ���� ���� ������(x++, x__)
		/*
		 * 1-1) ���� ���� ������
		 * ++ ���� ���� 1�� ���Ѵ�.
		 * val = ++num; // num�� ���� 1 ������ �� val ������ ����
		 * val = --num; // num�� ���� 1 ������ �� val ������ ����
		 * */
		
		int val, val2;
		int num1 = 10;
		
		val = ++num1; // num�� ���� 1 ������ �� val ������ ����
		System.out.println(val);
		
		val2 = --num1; // num�� ���� 1 ������ �� val ������ ����
		System.out.println(val2);
		
		/*
		 * 1-2) ���� ���� ������
		 * ++ ���� ���� 1�� ���Ѵ�.
		 */
		
		int val3, val4;
		int num2 = 10;
		
		val3 = num2++; // val3 ������ ���� num3 ���� ������ �� num2 ���� 1 ����
		System.out.println(val3);
		
		val4 = num2--;
		System.out.println("val4: " + val4);
		System.out.println("num2: " + num2);
	}

}