package com.kh.classSample;

public class StudentMain {

	public static void main(String[] args) {
		// �л� ��ü ����
		Student student1 = new Student("ȫ�浿", 20, "1�г�");
		Student student2 = new Student("�̼���", 21, "2�г�");
		Student student3 = new Student("�������", 22, "3�г�");
		
		// �л� ���� ���
		student1.displayInfo();
		student2.displayInfo();
		student3.displayInfo();
	}
}
