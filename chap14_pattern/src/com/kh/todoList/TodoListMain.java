package com.kh.todoList;

public class TodoListMain {

	public static void main(String[] args) {

		TodoListModel tdModel = new TodoListModel("아침 식사");
		TodoListView tdView = new TodoListView();
		
		tdView.displayTodoList();
		System.out.println(tdModel.getItem());
	}

}
