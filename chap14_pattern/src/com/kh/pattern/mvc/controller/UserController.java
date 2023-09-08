package com.kh.pattern.mvc.controller;
import com.kh.pattern.mvc.model.*;
import com.kh.pattern.mvc.view.*;

public class UserController {

	// 모델과 뷰 연결
	// 사용자 입력 처리
	private UserModel usermodel;
	private UserView userview;
	
	public UserModel getModel() {
		return usermodel;
	}

	public void setModel(UserModel usermodel) {
		this.usermodel = usermodel;
	}

	public UserView getView() {
		return userview;
	}

	public void setView(UserView userview) {
		this.userview = userview;
	}

	public UserController(UserModel usermodel, UserView userview) {
		this.usermodel = usermodel;
		this.userview = userview;
	}
	
	public void setUserName(String name) {
		usermodel.setName(name);
	}
	
	public void setUserAge(int age) {
		usermodel.setAge(age);
	}
	
	
}
