package com.kh.fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyMain {

	public static void main(String[] args) {
		String inputFile = "C:\\users\\user1\\Desktop\\java.png";
		String outputFile = "C:\\users\\user1\\Desktop\\Java.jpg";
		
		try (FileInputStream fis = new FileInputStream(inputFile);
				FileOutputStream fos = new FileOutputStream(outputFile)){
			byte[] buffer = new byte[1024];
			int byteRead;
			
			// 파일을 읽고 복사하는 동안 사용됨
			// fis.read(buffer) 파일에서 데이터를 읽어들이고
			// fos.write(buffer, 0, 
			while ((byteRead = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, byteRead);
			}
			System.out.println("파일 복사");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
