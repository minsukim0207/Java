package com.kh.exceptionsample;

public class NegativeNumberException extends Exception {
	// 사용자 정의 예외 클래스
	public NegativeNumberException(String msg) {
		super(msg);
	}
}
