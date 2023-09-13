package com.kh.api.exam1;

public class ObjectMain {

	public static void main(String[] args) {
	
		// ��ü ����
		Object obj = new Object();
		Object obj2 = new Object();
		
		// equals()
		boolean isEqual = obj.equals(obj2);
		System.out.println("obj�� obj2�� ������? " + isEqual);
		System.out.println();
		
		// hashcode()
		int hashcode1 = obj.hashCode();
		int hashcode2 = obj2.hashCode();
		System.out.println("obj�� �ؽ��ڵ�: " + hashcode1);
		System.out.println("obj2�� �ؽ��ڵ�: " + hashcode2);
		System.out.println();
		
		// toString()
		String objString = obj.toString();
		String obj2String = obj2.toString();
		System.out.println("obj�� ���ڿ�: " + objString);
		System.out.println("obj2�� ���ڿ�: " + obj2String);
		System.out.println();
		
		// getClass()
		Class<?> classOfObj1 = obj.getClass();
		Class<?> classOfObj2 = obj2.getClass();
		System.out.println("obj Ŭ���� " + classOfObj1.getClass());
		System.out.println("obj2 Ŭ���� " + classOfObj2.getClass());
		System.out.println();
	}

}
