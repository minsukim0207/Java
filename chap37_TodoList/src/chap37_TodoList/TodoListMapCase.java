package chap37_TodoList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TodoListMapCase {

	public static void main(String[] args) {

		Map<Integer, String> todoMap = new HashMap<>();
		int taskNumber = 1;
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("�� �� ���");
			for (Map.Entry<Integer, String> entry : todoMap.entrySet()) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
			
			System.out.println("�� ���� �����ϼ���.");
			System.out.println("1. �� �� �߰�");
			System.out.println("2. �� �� ����");
			System.out.println("3. ����");
			System.out.println("4. �� �� ���");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
				case 1:
					System.out.println("�߰��� ���� �ۼ����ּ���: ");
					String todoItem = sc.nextLine();
					todoMap.put(taskNumber, todoItem);
					System.out.println("�� ���� �߰��Ǿ����ϴ�.");
					break;
				case 2:
					System.out.println("������ ���� ��ȣ�� �Է��ϼ���: ");
					int removeNum = sc.nextInt();
					if (todoMap.containsKey(removeNum)) {
						todoMap.remove(removeNum);
						System.out.println("�� ���� ���ŵǾ����ϴ�.");
					} else {
						System.out.println("�ش� ��ȣ�� �� ���� �����ϴ�.");
					}
					break;
				case 3:
					System.out.println("���α׷��� �����մϴ�.");
					sc.close();
					System.exit(0);
					break;
				case 4:
					
					break;
				default :
					System.out.println("�ùٸ� ������ �ƴմϴ�.");
			}
		}
	}

}
