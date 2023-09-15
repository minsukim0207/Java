package com.kh.practice.chap01_poly.model.vo;

public class CookBook extends Book {
	
	private boolean coupon;
	
	public CookBook() {
		
	}
	
	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}
	
	@Override
	public String toString() {
		String str = "������: " + super.getTitle() + " ���ڸ�: " + super.getAuthor() + " ���ǻ��: " + super.getPublisher() + " ���� ����: " + this.coupon;
		return str;
	}
	
	public boolean getCoupon() {
		return this.coupon;
	}
	
	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}

}
