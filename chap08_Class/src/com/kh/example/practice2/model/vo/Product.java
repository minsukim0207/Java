package com.kh.example.practice2.model.vo;

public class Product {
	String pName;
	int price;
	String brand;
	
	public Product(String pName, String brand) {
		this.pName = pName;
		this.price = 0;
		this.brand = brand;
	}
	
	public void information() {
		System.out.println("상품명: " + pName);
		System.out.println("가격: " + price);
		System.out.println("브랜드: " + brand);
	}
}
