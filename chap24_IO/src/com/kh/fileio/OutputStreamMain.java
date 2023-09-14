package com.kh.fileio;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamMain {
/*
 * FileOutputStream
 * ���� �����͸� ���Ͽ� ���� ���� ���
 */
	public static void main(String[] args) {

		String filePath = "ex.txt";
		try {
			// ������ ������ ����ϰ� FileOutputStream ����
			FileOutputStream fos = new FileOutputStream(filePath);
			
			// ���Ͽ� ���� ������
			String data = "�ȳ��ϼ���";
			
			// ���ڿ��� ����Ʈ �迭�� ��ȯ�ϰ� ���Ͽ� ����
			byte[] bArray = data.getBytes(); // ����Ʈ�� ��ȯ
			try {
				fos.write(bArray);
				
				// FileOuputStream �ݱ�
				fos.close();
				System.out.println("�����Ͱ� ���Ͽ� ���������ϴ�.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
