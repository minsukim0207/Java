package com.kh.example.practice2.mode.vo;

public class Product {
	
	private String pName;
	private int price;
	private String brand;
	
	public Product() {
		this.pName = "������";
		this.price = 100;
		this.brand = "����";
	}

	public void information() {
		System.out.println("��ǰ �̸�: " + this.pName);
		System.out.println("��ǰ ����: " + this.price);
		System.out.println("��ǰ �귣��: " + this.brand);
	}

}
