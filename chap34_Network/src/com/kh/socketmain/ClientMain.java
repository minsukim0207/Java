package com.kh.socketmain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientMain {

	public static void main(String[] args) throws IOException {
		// ������ �����ϱ� ���� ���� ����
		Socket socket = new Socket("localhost", 12345);
		
		// ������ �����͸� ������ ���� ��� ��Ʈ��
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
		
		// �����κ��� �����͸� �ޱ� ���� ��� ��Ʈ�� ����
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		// Ű����κ��� �Է¹ޱ� ���� ����
		BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
		
		String userInputString;
		while ((userInputString = userInput.readLine()) != null) {
			// ����� �Է��� ������ ����
			out.println(userInputString);
			
			// �����κ��� ���� ���� ���
			String serverResponse = in.readLine();
			System.out.println("���� ����: " + serverResponse);
		}
		
		// ���� �� �Է� ��Ʈ�� �ݱ�
		socket.close();
		userInput.close();
	}

}
