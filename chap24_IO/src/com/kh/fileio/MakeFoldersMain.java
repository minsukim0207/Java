package com.kh.fileio;
import java.io.File;

public class MakeFoldersMain {
/*
 * 상위 디렉토리가 존재하지 않는 경우 중간 모든 디렉토리 생성
 */
	public static void main(String[] args) {
		
		String dirPath = "C:\\users\\user1\\Desktop\\parent\\child\\file";
		
		File dir = new File(dirPath);

		boolean success = dir.mkdirs();
		
		if (success) {
			System.out.println("폴더 생성");
		} else {
			System.out.println("폴더 생성 실패");
		}
	}

}
