package com.kh.practice2.func;

public class CastingPractice3 {
	//���� �� �ʱ�ȭ�� 5���� ������ ������ �˸��� ��Ģ����� ����ȯ�� �̿��� �ּ��� ���� ���� ���� ���� �������� �ڵ� �ۼ�
	public static void main(String[] args) {
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum2 - (int)dNum); //2
		
		System.out.println((float)iNum1); //10.0
		
		System.out.println(dNum); //2.5
		
		System.out.println((int)fNum); //3
		
		System.out.println(iNum1/fNum); //3.3333333
		
		System.out.println((double)iNum1/fNum); //3.3333333333333335
		
		System.out.println(ch); //ch 'A'
		System.out.println((int)ch);//ch 65
		System.out.println((int)ch + iNum1); //ch iNum1 75
		System.out.println((char)(iNum1 + (int)ch));//ch iNum1'K'
	}

}