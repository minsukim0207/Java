package com.kh.tcpmain;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(8080);
			System.out.println("���� ��� ��");
			
			// Ŭ���̾�Ʈ�� �����ϰ� �ʹٸ� Ŭ���̾�Ʈ�� �����ϴ� �ڵ� �ۼ�
			while (true) {
				// Ŭ���̾�Ʈ�� ���� ���
				Socket client = serverSocket.accept();
				System.out.println("Ŭ���̾�Ʈ�� ���� �Ϸ�");
				
				client.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
