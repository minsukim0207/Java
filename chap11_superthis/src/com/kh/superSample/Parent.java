package com.kh.superSample;

// 상속받아서 super(), super. 차이점 확인
// super. = 부모클래스의 변수나 메서드에 접근하기 위해 사용
// super() => 부모클래스의 생성자를 호출하기 위해0 사용
//			  서브클래스의 생성자에서 첫 번째 줄에 호출되어야 함

public class Parent {
	
	String name;
	
	Parent() { // 접근제한자 default
		System.out.println("부모클래스의 기본 생성자");
	}
	
	Parent(String name) {
		this.name = name;
		System.out.println("부모클래스의 문자열 파라미터 생성자. 이름: " + this.name);
	}
	
	public void show() {
		System.out.println("부모클래스의 show 메서드");
	}
}
