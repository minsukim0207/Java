package com.kh.objexam;

public class PracticeMain2 {

	public static void main(String[] args) {

		PracticeMain2 prac = new PracticeMain2();
		prac.practice1();
		System.out.println();
		
		prac.practice2();
		System.out.println();
		prac.practice3();
		System.out.println();
		prac.practice4();
		System.out.println();
		prac.practice5();
	}
	
	public void practice1() {
	
		StringBuffer sb = new StringBuffer();
		
		sb.append("���� ");
		sb.append("������ ");
		sb.append("�� ����");
		System.out.println(sb.toString());
	}

	public void practice2() {
		String str = "���� ������ ������";
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		sb.reverse();
		System.out.println(sb);
	}
	
	public void practice3() {
		String str = "���� ������ ������";
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		sb.insert(10, "?����");
		System.out.println(sb.toString());
	}
	
	public void practice4() {
		String str = "���� ������ ������";
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		sb.replace(3, 6, "������");
		System.out.println(sb.toString());
	}
	
	public void practice5() {
		String str = "���� ������ ������";
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		sb.delete(3, 7);
		System.out.println(sb.toString());
	}
}
