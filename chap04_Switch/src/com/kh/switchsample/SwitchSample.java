package com.kh.switchsample;

public class SwitchSample {

	public static void main(String[] args) {
		// Switch��
		// Ư�� ������ ǥ������ ���� ���� �پ��� ��츦 ó���ϴ� ���� ����
		// �Ϸ��� Case���� �ش� ���� ���Ͽ� ��ġ�ϴ� ��쿡 �ش��ϴ� �ڵ� ��� ����
		// �� Case�� �ڿ��� ��ġ�ϴ� ���̳� ǥ������ ����
	
		int day = 30;
		
		switch (day) {
			case 1:
				System.out.println("������");
				break;
			case 2:
				System.out.println("ȭ����");
				break;
			case 30:
				System.out.println("������");
				break;
			default :
				System.out.println("�ָ�");
		}
		
		int choice = 1;
		
		switch (choice) {
			case 1:
				System.out.println("�Ƹ޸�ī��");
				break;
			case 2:
				System.out.println("ī�� ��");
				break;
			case 3:
				System.out.println("���ν����");
				break;
			case 4:
				System.out.println("������Ƽ");
				break;
			default :
				System.out.println("�߸��� �����Դϴ�. �ٽ� �������ּ���.");
		}
	}

}
