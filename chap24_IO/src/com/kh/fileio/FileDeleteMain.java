package com.kh.fileio;
import java.io.File;

public class FileDeleteMain {

	public static void main(String[] args) {

		String mainPath = "C:\\users\\user1\\Desktop\\";
		String originFile = mainPath + "java.png";
		
		File fileToDelete = new File(originFile);
		
		// ���� ����
		boolean deleted = fileToDelete.delete();
		if (deleted) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� �̻���");
		}
	}

}
