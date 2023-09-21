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
			// 서버 주소와 포트 번호로 소켓 생성
			// 서버 주소와 포트 번호는 동일해야 함
			Socket socket = new Socket("localhost", 8080);
			System.out.println("[Server Connect]");
			
			// 보낼 때 코드
			OutputStream outStream = socket.getOutputStream();
			PrintStream printStream = new PrintStream(outStream);
			printStream.print("Hi Server");
			printStream.flush();
			
			// 서버로부터 읽어들임
			InputStream inStream = socket.getInputStream();
			Scanner sc = new Scanner(inStream);
			System.out.println("[Client] server" + sc.nextLine());
			socket.close();
			System.out.println("Bye Server");
	}

}
