package com.kh.instance.americano;

public class Americano {
	
	private int size;
	private boolean hasSugar;
	
	public Americano(int size, boolean hasSugar) {
		this.size = size;
		this.hasSugar = hasSugar;
	}
	
	public void makeCoffee() {
		System.out.println("아메리카노를 만듭니다.");
		System.out.println("크기: " + size);
		
		if(hasSugar) {
			System.out.println("설탕을 추가합니다.");
		}
	}
}
