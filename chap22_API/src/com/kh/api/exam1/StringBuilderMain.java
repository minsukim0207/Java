package com.kh.api.exam1;

public class StringBuilderMain {
/*
 * ���ڿ��� ������ ������ ���ο� ���ڿ� ��ü�� �����ϴ� ���� �ƴ϶� ���� ���ڿ��� �����ϴ� ������� ����
 * �޸� ����� ȿ�������� ��
 */
	public static void main(String[] args) {
		
		StringBuilder strBuilder = new StringBuilder();
		
		// append�� ���ڿ� �߰�
		strBuilder.append("Hello, ");
		strBuilder.append("world");
		
		String result = strBuilder.toString();
		System.out.println(result);
		
		// ���ڿ� ����
		strBuilder.insert(7, "Java");
		System.out.println(strBuilder.toString());
		
		// ���ڿ� ����
		strBuilder.delete(7, 12);
		System.out.println(strBuilder.toString());
		
		// ���ڿ� ��ü
		strBuilder.replace(7, 12, "Java �ְ��");
		System.out.println(strBuilder.toString());
		
		// ����
		strBuilder.reverse();
		System.out.println(strBuilder.toString());
	}

}
