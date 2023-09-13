package com.kh.api.exam1;

public class ObjectMain {

	public static void main(String[] args) {
	
		// 객체 생성
		Object obj = new Object();
		Object obj2 = new Object();
		
		// equals()
		boolean isEqual = obj.equals(obj2);
		System.out.println("obj와 obj2는 같은가? " + isEqual);
		System.out.println();
		
		// hashcode()
		int hashcode1 = obj.hashCode();
		int hashcode2 = obj2.hashCode();
		System.out.println("obj의 해시코드: " + hashcode1);
		System.out.println("obj2의 해시코드: " + hashcode2);
		System.out.println();
		
		// toString()
		String objString = obj.toString();
		String obj2String = obj2.toString();
		System.out.println("obj의 문자열: " + objString);
		System.out.println("obj2의 문자열: " + obj2String);
		System.out.println();
		
		// getClass()
		Class<?> classOfObj1 = obj.getClass();
		Class<?> classOfObj2 = obj2.getClass();
		System.out.println("obj 클래스 " + classOfObj1.getClass());
		System.out.println("obj2 클래스 " + classOfObj2.getClass());
		System.out.println();
	}

}
