package com.kh.practice.student.controller;
import com.kh.practice.student.model.vo.*;

public class StudentController {
	
	private Student[] sArr = new Student[5];

	public static int CUT_LINE = 60;
	
	public StudentController() {
		sArr[0] = new Student("김길동", "자바", 100);
		sArr[1] = new Student("박길동", "디비", 50);
		sArr[2] = new Student("이길동", "화면", 85);
		sArr[3] = new Student("정길동", "서버", 60);
		sArr[4] = new Student("홍길동", "자바", 20);
	}
	
	public Student[] printStudent() {
		return sArr;
	}
	
	public int sumScore() {
		return sArr[0].getScore() + sArr[1].getScore() + sArr[2].getScore() + sArr[3].getScore() + sArr[4].getScore();
	}
	
	public double[] avgScore() {
		double[] avg = new double[2];
		avg[0] = sumScore();
		avg[1] = avg[0] / 5;
		return avg;
	}
}
