package com.kh.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPractice {

	public static void main(String[] args) {
		CopyPractice cp = new CopyPractice();
		cp.prac1();
		cp.prac2();
	}
	
	public void prac1() {
		String inputFile = "C:\\users\\user1\\Desktop\\java.png";
		String outputFile = "C:\\users\\user1\\Desktop\\Java.jpg";
		
		try (FileInputStream fis = new FileInputStream(inputFile);
				FileOutputStream fos = new FileOutputStream(outputFile)){
			byte[] buffer = new byte[1024];
			int byteRead;
			
			while ((byteRead = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, byteRead);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void prac2() {
		String inputFile = "C:\\users\\user1\\Desktop\\java.png";
		String folderPath = "C:\\users\\user1\\Desktop\\java";
		
		File folder = new File(folderPath);
		
		if (!folder.exists()) {
			folder.mkdir();
			System.out.println("���� ����");
		} else {
			System.out.println("���� ����");
		}
		
		String outputFile = "C:\\users\\user1\\Desktop\\java\\Java.jpg";
		
		try (FileInputStream fis = new FileInputStream(inputFile);
				FileOutputStream fos = new FileOutputStream(outputFile)) {
			byte[] buffer = new byte[1024];
			int byteRead;
			
			while ((byteRead = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, byteRead);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
