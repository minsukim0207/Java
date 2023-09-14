package com.kh.fileio;
import java.io.File;

public class FileDeleteMain {

	public static void main(String[] args) {

		String mainPath = "C:\\users\\user1\\Desktop\\";
		String originFile = mainPath + "java.png";
		
		File fileToDelete = new File(originFile);
		
		// 파일 삭제
		boolean deleted = fileToDelete.delete();
		if (deleted) {
			System.out.println("파일 삭제");
		} else {
			System.out.println("파일 미삭제");
		}
	}

}
