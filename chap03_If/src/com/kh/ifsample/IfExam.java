package com.kh.ifsample;

public class IfExam {

	public static void main(String[] args) {
		// ��ø if��/���� if��
		
		// ������ ���� �溸
		
		int month = 9;
		int temp = -10;
		
		if (month == 1 || month == 2 || month == 12) {
			System.out.println("�ܿ�");
			
			if (temp <= -15) {
				System.out.println("���� �溸");
			} else if (temp <= -12) {
				System.out.println("���� ���Ǻ�");
			}
		} else if (month >= 3 && month <=5) {
			System.out.println("��");
		} else if (month >= 6 && month <= 8) {
			System.out.println("����");
			
			if (temp >= 35) {
				System.out.println("���� �溸");
			} else if (temp >= 33) {
				System.out.println("���� ���Ǻ�");
			}
		} else if (month >= 9 && month <= 11) {
			System.out.println("����");
		}
	}

}
