package com.kh.finalsample;

import java.io.FileWriter;

public class FileIOMain {
	public static void main(String[] args) {
		try {
			FileWriter fw = null;
			fw = new FileWriter("file.txt", true); // �� ��° ���� ���� boolean true �����Ǹ� �ش� ���Ͽ� �̾��
			fw.write(1000);
			fw.write(10000);
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
