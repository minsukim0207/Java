package com.kh.instance.tv;

public class TvMain {

	public static void main(String[] args) {
		
		Tv tv;	// Tv 인스턴스를 참조하기 위한 변수 tv를 선언
		tv = new Tv(); // Tv 인스턴스를 생성해서 변수 tv에 할당
		
		tv.channel = 7; // 변수 tv가 가리키는 Tv 객체의 인스턴스 변수 channel의 값을 7로 설정
		tv.channelDown(); // 변수 tv가 가리키는 Tv 객체의 메서드 channelDown 호출
		tv.power();
	}

}
