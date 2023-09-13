package com.kh.objexam;
import java.util.Date;
import java.text.SimpleDateFormat;

public class PracticeMain3 {
	
	public static void main(String[] args) {
		
		
		
		PracticeMain3 m = new PracticeMain3();
		m.practice1();
		System.out.println();
		m.practice2();
		System.out.println();
		m.practice3();
		System.out.println();
		m.practice4();
		System.out.println();
		m.practice5();
		
	}
	
	public void practice1() {
		
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		String str = sdf.format(date);
		
		System.out.println(str);
	}
	
	public void practice2() {
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss a");
		
		String str = sdf.format(date);
		
		System.out.println(str);
	}
	
	public void practice3() {
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
		
		String str = sdf.format(date);
		
		System.out.println(str);
	}
	
	public void practice4() {
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-HH");
		
		String str = sdf.format(date);
		
		System.out.println(str);
	}
	
	public void practice5() {
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-E");
		
		String str = sdf.format(date);
		
		System.out.println(str);
	}

}
