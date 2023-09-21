package com.kh.finalsample;

import java.net.InetAddress;
import java.net.Socket;

public class TcpClient {
	public static void main(String[] args) {

		int port = 3333;
		String serverIP;
	
		try {
			serverIP = InetAddress.getLocalHost().getHostAddress();
			Socket socket = new Socket(serverIP, port);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
