package com.kh.staticvar;

public class StudentMain {

	public static void main(String[] args) {
		
		StaticVar stkim = new StaticVar();
		stkim.setStudentName("ȫ�浿");
		
		//System.out.println(stkim.serialNum);
		stkim.serialNum++;
		
		StaticVar khlee = new StaticVar();
		khlee.setStudentName("�̼���");
		System.out.println(stkim.serialNum);
		System.out.println(khlee.serialNum);
	}

}
