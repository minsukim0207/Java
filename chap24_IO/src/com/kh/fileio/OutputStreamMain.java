package com.kh.fileio;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamMain {
/*
 * FileOutputStream
 * 이진 데이터를 파일에 쓰기 위해 사용
 */
	public static void main(String[] args) {

		String filePath = "ex.txt";
		try {
			// 지정된 파일을 대상하고 FileOutputStream 생성
			FileOutputStream fos = new FileOutputStream(filePath);
			
			// 파일에 쓰일 데이터
			String data = "안녕하세요";
			
			// 문자열을 바이트 배열로 변환하고 파일에 쓰기
			byte[] bArray = data.getBytes(); // 바이트로 변환
			try {
				fos.write(bArray);
				
				// FileOuputStream 닫기
				fos.close();
				System.out.println("데이터가 파일에 쓰여졌습니다.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
