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
		String str = "도서명: " + super.getTitle() + "저자명: " + super.getAuthor() + "출판사명: " + super.getPublisher() + "제한 나이: " + this.accessAge;
		return str;
	}
	
	public int getAccessAge() {
		return this.accessAge;
	}
	
	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}

}
