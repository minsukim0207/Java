package com.kh.operator;

public class Comparison {

	public static void main(String[] args) {
		// 4. �� ������ (Comparison)
		// ���� ���� �� ���
		/*
		 * ũ��, ��ȣ �� ���� ������ �� ����
		 * �� ���� �� �߿��� � ���� �� ũ�ų�, �۰ų�, ���ų�, �ٸ����� �Ǵ�
		 * �� �������� ��� ���� ��(true) �Ǵ� ����(false)���� ��ȯ
		 * > ���� ���� ũ�� ��, �ƴϸ� ������ ��ȯ
		 * < ���� ���� ������ ��, �ƴϸ� ������ ��ȯ
		 * >= ���� ���� ũ�ų� ������ ��, �ƴϸ� ������ ��ȯ
		 * <= ���� ���� �۰ų� ������ ��, �ƴϸ� ������ ��ȯ
		 * == �� ���� ���� ������ ��, �ƴϸ� ������ ��ȯ
		 * != �� ���� ���� �ٸ��� ��, �ƴϸ� ������ ��ȯ
		 */
		
		int p = 5;
		int q = 10;
		
		System.out.println("boolean�� ���� ����: " + (p == q));
		
		boolean isEqual = (p == q);
		
		System.out.println(isEqual);
		
		int r = 5;
		
		System.out.println(p == r);
		
		boolean isEqual1 = (p != q);
		
		System.out.println("p != q: " + isEqual1);
		
		boolean isEqual2 = (p != r);
		
		System.out.println("p != r: " + isEqual2);
	}

}
