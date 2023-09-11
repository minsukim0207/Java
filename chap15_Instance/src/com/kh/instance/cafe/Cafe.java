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
		System.out.println(this.type + "�� ����ϴ�.");
		System.out.println("������: " + this.size);
		
		if(hasSugar) {
			System.out.println("���� �߰�");
		}
	}

}
