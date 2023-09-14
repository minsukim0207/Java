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
			
			br.close(); // ������ �� ������ ����
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
		/*
		String filePath = "���� �ۼ���/IO.txt";
		FileWriter fWriter = new FileWriter(filePath, true);
		// true: ���� ���� �̾��
		// false: ���� �����
		File f = new File("newFile.txt");
		try {
			if (f.createNewFile()) {
				System.out.println("���� ����");
			} else {
				System.out.println("���� ����");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		String fileName = f.getName();
		FileReader fReader = new FileReader(f);
		*/