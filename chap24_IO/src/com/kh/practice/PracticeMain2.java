package com.kh.practice;
import java.io.File;

public class PracticeMain2 {

	public static void main(String[] args) {

		PracticeMain2 pm = new PracticeMain2();
		
		pm.prac1();
	}
	
	public void prac1() {
		
		String dirPath = "C:\\users\\user1\\Desktop\\name1\\name2";
		
		File dir = new File(dirPath);
		dir.mkdirs();
		
		String dirPath1 = "C:\\users\\user1\\Java_Workspace\\chap25_";
		
		dir = new File(dirPath1);
		dir.mkdirs();
		
		String dirPath2 = "C:\\users\\user1\\Documents\\myPlace\\Music\\Korean\\Kpop\\Group";
		
		dir = new File(dirPath2);
		dir.mkdirs();
	}

}
