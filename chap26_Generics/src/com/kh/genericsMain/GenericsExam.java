package com.kh.genericsMain;

public class GenericsExam {

	public static void main(String[] args) {
		// 정수형 데이터를 저장하는 Book 인스턴스 생성
		Book<Integer> intBook = new Book<>();
		intBook.put(42);
		intBook.put(66);
		int intValue = intBook.get(); // 형 변환 필요 없음
		
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