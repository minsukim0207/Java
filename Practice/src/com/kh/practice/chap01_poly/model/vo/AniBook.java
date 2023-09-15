package com.kh.practice.chap01_poly.model.vo;

public class AniBook extends Book {
	
	private int accessAge;
	
	public AniBook() {
		
	}
	
	public AniBook(String title, String author, String publisher, int accessAge) {
		super(title, author, publisher);
		this.accessAge = accessAge;
	}
	
	@Override
	public String toString() {
		String str = "������: " + super.getTitle() + " ���ڸ�: " + super.getAuthor() + " ���ǻ��: " + super.getPublisher() + " ���� ����: " + this.accessAge;
		return str;
	}
	
	public int getAccessAge() {
		return this.accessAge;
	}
	
	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}

}
