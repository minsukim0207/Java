package com.kh.classAM;

public class AM {
	
	public int pNum1 = 10;
	protected int pNum2 = 20;
	int pNum3 = 30; // ���������ڸ� ������� ������ default
	private int pNum4 = 40;
	
	public void publicMethod() {
		System.out.println("public Method ȣ���");
	}
	
	protected void protectedMethod() {
		System.out.println("protected Method ȣ���");
	}
	
	void defaultMethod() { // ���������ڸ� ������� ������ default
		System.out.println("default Method ȣ���");
	}
	
	private void privateMethod() {
		System.out.println("private Method ȣ���");
	}
}
