package com.kh.socketmain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientMain {

	public static void main(String[] args) throws IOException {
		// 서버에 연결하기 위한 소켓 생성
		Socket socket = new Socket("localhost", 12345);
		
		// 서버로 데이터를 보내기 위한 출력 스트림
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
		
		// 서버로부터 데이터를 받기 위한 출력 스트림 생성
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		// 키보드로부터 입력받기 위한 생성
		BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
		
		String userInputString;
		while ((userInputString = userInput.readLine()) != null) {
			// 사용자 입력을 서버로 전송
			out.println(userInputString);
			
			// 서버로부터 받은 응답 출력
			String serverResponse = in.readLine();
			System.out.println("서버 응답: " + serverResponse);
		}
		
		// 소켓 및 입력 스트림 닫기
		socket.close();
		userInput.close();
	}

}
