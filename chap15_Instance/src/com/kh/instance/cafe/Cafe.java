package com.kh.instance.cafe;

public class Cafe {
	
	String type;
	int size;
	boolean hasSugar;
	
	public Cafe(String type, int size, boolean hasSugar) {
		this.type = type;
		this.size = size;
		this.hasSugar = hasSugar;
	}
	
	public void makeCoffee() {
		System.out.println(this.type + "을 만듭니다.");
		System.out.println("사이즈: " + this.size);
		
		if(hasSugar) {
			System.out.println("설탕 추가");
		}
	}

}
