package com.kh.classarray;

public class StudentMain {

	public static void main(String[] args) {

		Student[] student = new Student[3];
		
		student[0] = new Student("홍길동", 17);
		student[1] = new Student("이순신", 18);
		student[2] = new Student("장발장", 19);
		
		System.out.println("총 학생 수: " + student.length);
		System.out.println("첫번째 학생 이름: " + student[0].name);
		System.out.println("첫번째 학생 나이: " + student[0].age);
		System.out.println("두번째 학생 이름: " + student[1].name);
		System.out.println("두번째 학생 나이: " + student[1].age);
		System.out.println("세번째 학생 이름: " + student[2].name);
		System.out.println("세번째 학생 나이: " + student[2].age);
		
		for (int i = 0; i < student.length; i++) {
			System.out.println((i + 1) + "번째 학생 이름: " + student[i].name);
			System.out.println((i + 1) + "번째 학생 나이: " + student[i].age);
		}
	}

}
