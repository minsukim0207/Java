package com.kh.instance.americano;

public class Americano {
	
	private int size;
	private boolean hasSugar;
	
	public Americano(int size, boolean hasSugar) {
		this.size = size;
		this.hasSugar = hasSugar;
	}
	
	public void makeCoffee() {
		System.out.println("�Ƹ޸�ī�븦 ����ϴ�.");
		System.out.println("ũ��: " + size);
		
		if(hasSugar) {
			System.out.println("������ �߰��մϴ�.");
		}
	}
}
