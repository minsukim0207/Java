package com.kh.finalsample;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	public static void main(String[] args) {

		int port = 3333;
		try {
			ServerSocket server = new ServerSocket(port);
		
			while (true) {
				Socket client = server.accept();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
