package chap37_TodoList;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class TodoListSet {
	
	private Set<String> task;
	
	public TodoListSet() {
		task = new HashSet<>();
	}
	
	public void addList(String todo) {
		task.add(todo);
	}
	
	public void removeList(String todo) {
		task.remove(todo);
	}
	
	public void displayList() {
		for (String todo : task) {
			System.out.println(todo);
		}
	}
	
	public boolean isEmpty() {
		return task.isEmpty();
	}

	public boolean containsList(String todo) {
		return task.contains(todo);
	}
	public static void main(String[] args) {
		
		TodoListSet todoList = new TodoListSet();
		
		System.out.println("===My Todo List===");
		int menu;

		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("1. 할 일 추가\n2. 할 일 삭제\n3. 목록 확인\n4. 종료");
			System.out.print("메뉴를 선택하세요: ");
			menu = sc.nextInt();
			sc.nextLine();
			
			switch (menu) {
				case 1:
					System.out.print("할 일을 입력하세요: ");
					todoList.addList(sc.nextLine());
					break;
				case 2:
					if (todoList.isEmpty()) {
						System.out.println("할 일이 없습니다.");
					} else {
						System.out.print("삭제할 일을 입력하세요: ");
						todoList.displayList();
						if (todoList.containsList(sc.nextLine())) {
							todoList.removeList(sc.nextLine());
						} else {
							System.out.println("목록에 존재하지 않습니다.");
						}
					}
					break;
				case 3:
					if (todoList.isEmpty()) {
						System.out.println("할 일이 없습니다.");
					} else {
						System.out.println("===할 일 목록===");
						todoList.displayList();
					}
					break;
				case 4:
					System.out.println("프로그램 종료");
					sc.close();
					System.exit(0);
				default :
					System.out.println("올바른 선택이 아닙니다.");
			}
		}
	}
}