package com.kh.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MakeFolderMain {

	public static void main(String[] args) {
		
		MakeFolderMain pm = new MakeFolderMain();
		pm.prac2();
	}
	
	public void prac1() {
		// ������ ������ ��� ����
		String folderPath = "C:\\users\\user1\\Desktop\\newFolder";
				
		// ���� ����
		File folder = new File(folderPath);
				
		// ���� ���� Ȯ��
		if (!folder.exists()) {
			folder.mkdir();
			System.out.println("������ ���������� �����Ǿ����ϴ�.");
		} else {
			System.out.println("������ �̹� �����մϴ�.");
		}
	}

	public void prac2() {
		String folderPath = "C:\\users\\user1\\Desktop\\new_folder";
		
		File folder = new File(folderPath);
		
		if (!folder.exists()) {
			folder.mkdir();
			System.out.println("���� ����");
		} else {
			System.out.println("���� ����");
		}
		
		try {
			FileWriter w = new FileWriter("C:\\users\\user1\\Desktop\\new_folder\\newFile.txt");
			w.write("���� ����");
			w.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
