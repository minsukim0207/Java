package com.kh.example.practice2.model.run;
import com.kh.example.practice2.model.vo.*;

public class ProductRun {

	public static void main(String[] args) {
		// Product 3�� �����ϰ�
		// ���� ��ǰ�� ���� �귣��� ����ϱ�
		
		Product product1 = new Product("������", "����");
		Product product2 = new Product("�ƺ�", "����");
		Product product3 = new Product("�����е�", "����");
		
		product1.information();
		product2.information();
		product3.information();
	}

}
