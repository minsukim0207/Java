package com.kh.variable;

public class Variable {
	public static void main(String[] args) {
		//1. ������ �̸��� ������, ����, ������ھ�(_), �޷�($)�� ������ �� �ִ�.
		//2. ������ �̸��� ���ڷ� ������ �� ����.
		//3. ���� �̸� ���̿��� ������ ������ �� ����.
		//	 ����� ��Ģ���� ����� ���� ���� ������ �� ����ϱ� ������ ������� �ʴ´�.
		//4. �ڹٿ��� �̸� ������ ���� ���� �̸����� ������� ���Ѵ�.
		
		//�Ǽ��� (float, double)
		float PI1 = 3.14151611111111f; //float�� f�� F
		double PI2 = 3.14151611111111;
		System.out.println("float: " + PI1);
		System.out.println("double: " + PI2);
		
		//byte�� -128~127���� ��� ����
		//byte bt = -129; //int�� �����ϰų� ���� byte + byte�� �־���� �Ѵ�.
		byte bt = 127; //-129 ���Ͽ� 128 �̻���� ���� �Ұ�.
		System.out.println(bt);
		
		//short�� -32768 ~ 32767 ���� ��� ����
		short shrt = -32767; //-32768���Ͽ� 32768 �̻���� ���� �Ұ�.
		System.out.println(shrt);
		
		//int�� -2,147,483,648 ~ 2,147,483,647���� ��� ����.
		int nt = -2147483648;
		System.out.println(nt);
		
		//long
		long lng = 2000L; //�ڿ� l�Ǵ� L�� �ٿ��ش�.
		
		//char�� ���� �ϳ��� ������ �� ����.
		char chr1 = 'a';
		System.out.println(chr1);
		
		//String�� �⺻ �ڷ����� ���� ������ �⺻������ ��� ��.
		//�⺻ �ڷ����� ���� �ʱ� ������ String���� ǥ����.
		//String�� ū ����ǥ("") �Ǵ� ���� ����ǥ('') �ȿ� ���ڸ� �ۼ��� ��.
		String hi = "�ȳ��ϼ���";
		
		//boolean�� TRUE�� FALSE�� �����Ѵ�.
		boolean bln = true;
		System.out.println(bln);
		boolean bln2 = false;
		System.out.println(bln2);
		
		System.out.println("�ȳ��ϼ���. ���� ȫ�浿�Դϴ�.");
		String name = "ȫ�浿";
		System.out.println("�ȳ��ϼ���. ���� " + name + "�Դϴ�.");
		//�ѹ� Ÿ���� ������ ������ �缱���� �� ����.
		name = "��ö��";
		System.out.println("�ȳ��ϼ���. ���� " + name + "�Դϴ�.");
		
		
		int age = 20;
		String baseball = "�߱�";
		System.out.println("�ȳ��ϼ���. ���� " + name + "�Դϴ�.");
		System.out.print("���� ���̴� " + age + "�� �̰�, ");
		System.out.println("���� ��̴� " + baseball + "�Դϴ�.");
		
		char score = 'a';
		System.out.println("���� ������ " + score + "�Դϴ�.");
	}
}
