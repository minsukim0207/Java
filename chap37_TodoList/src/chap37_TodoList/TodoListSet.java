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
			System.out.println("1. �� �� �߰�\n2. �� �� ����\n3. ��� Ȯ��\n4. ����");
			System.out.print("�޴��� �����ϼ���: ");
			menu = sc.nextInt();
			sc.nextLine();
			
			switch (menu) {
				case 1:
					System.out.print("�� ���� �Է��ϼ���: ");
					todoList.addList(sc.nextLine());
					break;
				case 2:
					if (todoList.isEmpty()) {
						System.out.println("�� ���� �����ϴ�.");
					} else {
						System.out.print("������ ���� �Է��ϼ���: ");
						todoList.displayList();
						if (todoList.containsList(sc.nextLine())) {
							todoList.removeList(sc.nextLine());
						} else {
							System.out.println("��Ͽ� �������� �ʽ��ϴ�.");
						}
					}
					break;
				case 3:
					if (todoList.isEmpty()) {
						System.out.println("�� ���� �����ϴ�.");
					} else {
						System.out.println("===�� �� ���===");
						todoList.displayList();
					}
					break;
				case 4:
					System.out.println("���α׷� ����");
					sc.close();
					System.exit(0);
				default :
					System.out.println("�ùٸ� ������ �ƴմϴ�.");
			}
		}
	}
}