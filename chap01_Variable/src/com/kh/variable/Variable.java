package com.kh.variable;

public class Variable {
	public static void main(String[] args) {
		//1. 변수의 이름은 영문자, 숫자, 언더스코어(_), 달러($)로 구성할 수 있다.
		//2. 변수의 이름은 숫자로 시작할 수 없다.
		//3. 변수 이름 사이에는 공백을 포함할 수 없다.
		//	 언어의 규칙으로 띄어쓰기는 무언가 새로 시작할 때 사용하기 때문에 사용하지 않는다.
		//4. 자바에서 미리 예약한 언어는 변수 이름으로 사용하지 못한다.
		
		//실수형 (float, double)
		float PI1 = 3.14151611111111f; //float은 f나 F
		double PI2 = 3.14151611111111;
		System.out.println("float: " + PI1);
		System.out.println("double: " + PI2);
		
		//byte는 -128~127까지 사용 가능
		//byte bt = -129; //int로 변경하거나 값을 byte + byte로 넣어줘야 한다.
		byte bt = 127; //-129 이하와 128 이상부터 저장 불가.
		System.out.println(bt);
		
		//short는 -32768 ~ 32767 까지 사용 가능
		short shrt = -32767; //-32768이하와 32768 이상부터 저장 불가.
		System.out.println(shrt);
		
		//int는 -2,147,483,648 ~ 2,147,483,647까지 사용 가능.
		int nt = -2147483648;
		System.out.println(nt);
		
		//long
		long lng = 2000L; //뒤에 l또는 L을 붙여준다.
		
		//char은 문자 하나를 저장할 수 있음.
		char chr1 = 'a';
		System.out.println(chr1);
		
		//String은 기본 자료형에 들어가지 않으나 기본적으로 사용 됨.
		//기본 자료형에 들어가지 않기 때문에 String으로 표현됨.
		//String은 큰 따옴표("") 또는 작은 따옴표('') 안에 글자를 작성할 것.
		String hi = "안녕하세요";
		
		//boolean은 TRUE와 FALSE를 저장한다.
		boolean bln = true;
		System.out.println(bln);
		boolean bln2 = false;
		System.out.println(bln2);
		
		System.out.println("안녕하세요. 저는 홍길동입니다.");
		String name = "홍길동";
		System.out.println("안녕하세요. 저는 " + name + "입니다.");
		//한번 타입을 선언한 변수는 재선언할 수 없다.
		name = "박철수";
		System.out.println("안녕하세요. 저는 " + name + "입니다.");
		
		
		int age = 20;
		String baseball = "야구";
		System.out.println("안녕하세요. 저는 " + name + "입니다.");
		System.out.print("저의 나이는 " + age + "살 이고, ");
		System.out.println("저의 취미는 " + baseball + "입니다.");
		
		char score = 'a';
		System.out.println("저의 성적은 " + score + "입니다.");
	}
}
