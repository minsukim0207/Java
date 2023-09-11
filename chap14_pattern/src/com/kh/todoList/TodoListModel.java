package com.kh.todoList;

public class TodoListModel {
	
	private String items;
	private String item;
	
	public TodoListModel(String text) {
		this.item = text;
	}
	
	public String getItem() {
		return this.item;
	}

}
