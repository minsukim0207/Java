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
		// 폴더를 생성할 경로 지정
		String folderPath = "C:\\users\\user1\\Desktop\\newFolder";
				
		// 폴더 생성
		File folder = new File(folderPath);
				
		// 폴더 유무 확인
		if (!folder.exists()) {
			folder.mkdir();
			System.out.println("폴더가 성공적으로 생성되었습니다.");
		} else {
			System.out.println("폴더가 이미 존재합니다.");
		}
	}

	public void prac2() {
		String folderPath = "C:\\users\\user1\\Desktop\\new_folder";
		
		File folder = new File(folderPath);
		
		if (!folder.exists()) {
			folder.mkdir();
			System.out.println("폴더 생성");
		} else {
			System.out.println("폴더 존재");
		}
		
		try {
			FileWriter w = new FileWriter("C:\\users\\user1\\Desktop\\new_folder\\newFile.txt");
			w.write("파일 쓰기");
			w.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
