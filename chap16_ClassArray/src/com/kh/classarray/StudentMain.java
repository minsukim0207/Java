package com.kh.classarray;

public class StudentMain {

	public static void main(String[] args) {

		Student[] student = new Student[3];
		
		student[0] = new Student("ȫ�浿", 17);
		student[1] = new Student("�̼���", 18);
		student[2] = new Student("�����", 19);
		
		System.out.println("�� �л� ��: " + student.length);
		System.out.println("ù��° �л� �̸�: " + student[0].name);
		System.out.println("ù��° �л� ����: " + student[0].age);
		System.out.println("�ι�° �л� �̸�: " + student[1].name);
		System.out.println("�ι�° �л� ����: " + student[1].age);
		System.out.println("����° �л� �̸�: " + student[2].name);
		System.out.println("����° �л� ����: " + student[2].age);
		
		for (int i = 0; i < student.length; i++) {
			System.out.println((i + 1) + "��° �л� �̸�: " + student[i].name);
			System.out.println((i + 1) + "��° �л� ����: " + student[i].age);
		}
	}

}
