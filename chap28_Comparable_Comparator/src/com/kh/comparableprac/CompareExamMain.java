package com.kh.comparableprac;
import java.util.List;
import java.util.ArrayList;

public class CompareExamMain {

	public static void main(String[] args) {
		List<Student> ce = new ArrayList<>();
		ce.add(new Student("1", 12));
		ce.add(new Student("2", 13));
		ce.add(new Student("3", 14));
		
		for (Student comexam : ce) {
			System.out.println(comexam);
		}

	}

}
