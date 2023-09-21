package com.kh.tcpmain;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {
	public static void main(String[] args) throws Exception{
			// ���� �ּҿ� ��Ʈ ��ȣ�� ���� ����
			// ���� �ּҿ� ��Ʈ ��ȣ�� �����ؾ� ��
			Socket socket = new Socket("localhost", 8080);
			System.out.println("[Server Connect]");
			
			// ���� �� �ڵ�
			OutputStream outStream = socket.getOutputStream();
			PrintStream printStream = new PrintStream(outStream);
			printStream.print("Hi Server");
			printStream.flush();
			
			// �����κ��� �о����
			InputStream inStream = socket.getInputStream();
			Scanner sc = new Scanner(inStream);
			System.out.println("[Client] server" + sc.nextLine());
			socket.close();
			System.out.println("Bye Server");
	}

}
