package com.kh.pattern.mvc;
import com.kh.pattern.mvc.model.*;
import com.kh.pattern.mvc.view.*;
import com.kh.pattern.mvc.controller.*;

public class UserClient {

	public static void main(String[] args) {
		
		// �� ��ü ����
		UserModel model = new UserModel("ȫ�浿", 20);
		
		// �� ��ü ����
		UserView view = new UserView();
		
		// ��Ʈ�ѷ� ��ü ���� �� �� �� ����
		UserController controller = new UserController(model, view);
		
		// �л� ���� ������Ʈ�ؼ� ���
		//controller.updateView();
		
		// �л� ���� ���
		controller.setUserName("�̼���");
		controller.setUserAge(30);
		
		// ������Ʈ�� �л� ���� ���
		//controller.updateView();
	}
}
