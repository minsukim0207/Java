package com.kh.fileio;
import java.io.File;

public class MakeFoldersMain {
/*
 * ���� ���丮�� �������� �ʴ� ��� �߰� ��� ���丮 ����
 */
	public static void main(String[] args) {
		
		String dirPath = "C:\\users\\user1\\Desktop\\parent\\child\\file";
		
		File dir = new File(dirPath);

		boolean success = dir.mkdirs();
		
		if (success) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� ���� ����");
		}
	}

}
