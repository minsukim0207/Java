package com.kh.todoList;

public class TodoListMain {

	public static void main(String[] args) {

		TodoListModel tdModel = new TodoListModel("��ħ �Ļ�");
		TodoListView tdView = new TodoListView();
		
		tdView.displayTodoList();
	}

}
