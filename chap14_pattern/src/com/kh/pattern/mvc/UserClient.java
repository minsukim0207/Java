package com.kh.pattern.mvc;
import com.kh.pattern.mvc.model.*;
import com.kh.pattern.mvc.view.*;
import com.kh.pattern.mvc.controller.*;

public class UserClient {

	public static void main(String[] args) {
		
		// 모델 객체 생성
		UserModel model = new UserModel("홍길동", 20);
		
		// 뷰 객체 생성
		UserView view = new UserView();
		
		// 컨트롤러 객체 생성 및 모델 뷰 설정
		UserController controller = new UserController(model, view);
		
		// 학생 정보 업데이트해서 출력
		//controller.updateView();
		
		// 학생 정보 출력
		controller.setUserName("이순신");
		controller.setUserAge(30);
		
		// 업데이트된 학생 정보 출력
		//controller.updateView();
	}
}
