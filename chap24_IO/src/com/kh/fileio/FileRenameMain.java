package com.kh.fileio;

import java.io.File;

public class FileRenameMain {

	public static void main(String[] args) {
		String originFile = "C:\\users\\user1\\Desktop\\java.png";
		String newFile = "C:\\users\\user1\\Desktop\\Java.png";
		
		File currentFile = new File(originFile);
		File renameFile = new File(newFile);
		
		if (currentFile.renameTo(renameFile)) {
			System.out.println("�̸� ���� ����");
		} else {
			System.out.println("�̸� ���� ����");
		}
	}

}
