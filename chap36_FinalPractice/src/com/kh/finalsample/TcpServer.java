package com.kh.finalsample;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TcpServer {
	public static void main(String[] args) {

		int port = 3333;
		try {
			ServerSocket server = new ServerSocket(port);
			System.out.println("서버 대기");
		
			while (true) {
				Socket client = server.accept();
				System.out.println("클라이언트 연결 완료");
				
				InputStream inputStream = client.getInputStream();
				Scanner sc = new Scanner(inputStream);
				
				OutputStream outputStream = client.getOutputStream();
				PrintStream printStream = new PrintStream(outputStream);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
