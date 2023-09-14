package com.kh.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeMain {

	public static void main(String[] args) {

		PracticeMain main = new PracticeMain();
		main.prac1();
	}
	
	public void prac1() { // 경로 설정해서 파일 생성
		try {
			FileWriter w = new FileWriter("C:\\users\\user1\\Desktop\\newFile.txt");
			w.write("파일 쓰기");
			w.close();
			
			FileReader fr = new FileReader("C:\\users\\user1\\Desktop\\newFile.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
