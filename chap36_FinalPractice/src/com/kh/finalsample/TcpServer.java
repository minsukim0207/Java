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
			System.out.println("���� ���");
		
			while (true) {
				Socket client = server.accept();
				System.out.println("Ŭ���̾�Ʈ ���� �Ϸ�");
				
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
