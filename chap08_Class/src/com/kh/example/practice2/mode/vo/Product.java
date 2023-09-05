package com.kh.example.practice2.mode.vo;

public class Product {
	
	private String pName;
	private int price;
	private String brand;
	
	public Product() {
		this.pName = "아이폰";
		this.price = 100;
		this.brand = "애플";
	}

	public void information() {
		System.out.println("제품 이름: " + pName);
		System.out.println("제품 가격: " + price);
		System.out.println("제품 브랜드: " + brand);
	}

}
