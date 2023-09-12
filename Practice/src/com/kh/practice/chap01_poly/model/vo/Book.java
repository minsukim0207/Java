package com.kh.practice.chap01_poly.model.vo;

public class Book {
	
	private String title;
	private String author;
	private String publisher;
	
	public Book() {

	}
	
	public Book(String title, String author, String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	
	public String toString() {
		String str = "도서명: " + this.title + "저자명: " + this.author + "출판사명: " + this.publisher;
		return str;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public String getPublisher() {
		return this.publisher;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
}
