package com.kh.pattern.mvc;
import com.kh.pattern.mvc.controller.*;
import com.kh.pattern.mvc.model.*;
import com.kh.pattern.mvc.view.*;

public class StudentClient {
	
	// MVC ������ ����ؼ� �л� ������ �ٷ�� ��

	public static void main(String[] args) {
		// �� ��ü ���� Model
		StudentModel model = new StudentModel("ȫ�浿", 20);
		// �� ��ü ���� View
		StudentView view = new StudentView();
		// ��Ʈ�ѷ� ��ü ���� Controller (��, �� ����)
		StudentController controller = new StudentController(model, view);
		// �л� ���� ������Ʈ�ؼ� ���
		controller.updateView();
		// �л� ���� ������Ʈ
		controller.setStudentName("�̼���");
		controller.setStudentAge(30);
		// ������Ʈ�� �л� ���� ���
		controller.updateView();
	}

}
