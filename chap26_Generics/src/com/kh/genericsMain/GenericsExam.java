package com.kh.genericsMain;

public class GenericsExam {

	public static void main(String[] args) {
		// ������ �����͸� �����ϴ� Book �ν��Ͻ� ����
		Book<Integer> intBook = new Book<>();
		intBook.put(42);
		intBook.put(66);
		int intValue = intBook.get(); // �� ��ȯ �ʿ� ����
		
		Book<String> strBook = new Book<>();
		strBook.put("Hello");
		strBook.put("gggg");
		strBook.put("Java");
		strBook.put("Python");
		String strValue = strBook.get();
		
		System.out.println(intValue);
		System.out.println(strValue);
	}

}