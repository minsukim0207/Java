package com.kh.pattern.mvc;
import com.kh.pattern.mvc.controller.*;
import com.kh.pattern.mvc.model.*;
import com.kh.pattern.mvc.view.*;

public class StudentClient {
	
	// MVC 패턴을 사용해서 학생 정보를 다루는 곳

	public static void main(String[] args) {
		// 모델 객체 생성 Model
		StudentModel model = new StudentModel("홍길동", 20);
		// 뷰 객체 생성 View
		StudentView view = new StudentView();
		// 컨트롤러 객체 생성 Controller (모델, 뷰 설정)
		StudentController controller = new StudentController(model, view);
		// 학생 정보 업데이트해서 출력
		controller.updateView();
		// 학생 정보 업데이트
		controller.setStudentName("이순신");
		controller.setStudentAge(30);
		// 업데이트된 학생 정보 출력
		controller.updateView();
	}

}
