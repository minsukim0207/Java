package com.kh.fileio;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;

public class FileIoMain {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("abcde.txt");
			writer.write("Java is fun");
			writer.close();
			
			FileReader reader = new FileReader("abcde.txt");
			BufferedReader br = new BufferedReader(reader);
			
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
			br.close(); // 파일을 다 읽으면 종료
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
		/*
		String filePath = "설명 작성란/IO.txt";
		FileWriter fWriter = new FileWriter(filePath, true);
		// true: 파일 끝에 이어쓰기
		// false: 파일 덮어쓰기
		File f = new File("newFile.txt");
		try {
			if (f.createNewFile()) {
				System.out.println("파일 생성");
			} else {
				System.out.println("파일 존재");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		String fileName = f.getName();
		FileReader fReader = new FileReader(f);
		*/