package com.kh.operator;

public class OperatorExam {

	public static void main(String[] args) {
		// 1. ���� ���� ������
		// ���� 1�� ������Ų �� �� ���� �ٽ� ������ �Ҵ�
		// i�� ���� 1 ������Ű�� �� ���� �ٽ� i�� �Ҵ�
		
		int i = 5;
		i = ++i;
		System.out.println("i = ++i" + i);
		
		// 2. ���� ���� ������
		// ������ ���� ���� ����� �� ���� 1�� ������Ŵ
		// i�� ���簪�� i�� �Ҵ��ϰ� �� �Ŀ� i�� ���� 1 ������Ų��
		// �Ҵ��� ���簪�̹Ƿ� i�� ������� �ʴ´�.
		
		int i1 = 5;
		i1 = i1++;
		System.out.println("i1 : i1++" + i1);
		
		int a = 5;
		++a;
		System.out.println("++a: " + a);
		
		int b = 5;
		b++;
		System.out.println("++b: " + b);
	}

}
