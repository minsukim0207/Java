package com.kh.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class InputStreamMain {
/*
 * FileInputStream
 * ������ ���� �� ���Ǵ� Ŭ����
 * ���Ϸκ��� �����͸� ����Ʈ ��Ʈ������ �о���� �� ����
 * 
 * int read()
 * ���Ͽ��� ���� �����͸� �а� ��ȯ
 * �� �̻� ���� �����Ͱ� ������ -1�� ��ȯ
 * int read(byte[] b) : ���Ͽ��� ����Ʈ �迭 'b'�� �����͸� �а� ������ ���� ����Ʈ ���� ��ȯ
 * int read(byte[] b, int off, int len) : ���Ͽ��� ����Ʈ �迭 'b'�� �������� ��ġ���� �ִ� len ����Ʈ��ŭ �о ������ ���� ����Ʈ ���� ��ȯ
 * void close() ���� �ݱ�
 */
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			String fileName = "exam.txt";
			try {
				FileWriter w = new FileWriter(fileName);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			fis = new FileInputStream(fileName);
			
			int data;
			try {
				data = fis.read();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}