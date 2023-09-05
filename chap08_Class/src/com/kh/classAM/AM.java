package com.kh.classAM;

public class AM {
	
	public int pNum1 = 10;
	protected int pNum2 = 20;
	int pNum3 = 30; // 접근제한자를 명시하지 않으면 default
	private int pNum4 = 40;
	
	public void publicMethod() {
		System.out.println("public Method 호출됨");
	}
	
	protected void protectedMethod() {
		System.out.println("protected Method 호출됨");
	}
	
	void defaultMethod() { // 접근제한자를 명시하지 않으면 default
		System.out.println("default Method 호출됨");
	}
	
	private void privateMethod() {
		System.out.println("private Method 호출됨");
	}
}
