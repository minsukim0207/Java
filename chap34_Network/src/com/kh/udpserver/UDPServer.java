package com.kh.udpserver;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * DatagramSocket
 * UDP 통신을 위한 소켓 클래스
 * UTP 소켓과 다르게 연결을 설정하거나 연결 유지를 관리하지 않고 데이터 패킷을 단순히 보내고 받는 역할
 * 
 * DatagramPacket
 * UDP 데이터 패킷을 나타내는 클래스
 * 데이터의 실제 내용과 데이터를 보낼 대상 또는 데이터를 수신할 대상의 주소 정보를 포함
 * 
 * 패킷이란?
 * 컴퓨터 네트워크가 전달하는 데이터의 형식화된 블록
 * 데이터를 주고 받을 때 사용하는 규칙
 * Pack + Bucket
 */
public class UDPServer {

	public void start() throws Exception {
		DatagramSocket socket = new DatagramSocket(6666);
		DatagramPacket inPacket, outPacket;
		byte[] inMsg = new byte[10];
		byte[] outMsg;
	
		while (true) {
		// 데이터 수신을 위한 패킷 생성
		inPacket = new DatagramPacket(inMsg, inMsg.length);
		// 패킷을 통해 데이터를 받음
		socket.receive(inPacket);
		
		// 수신한 패킷에서 클라이언트의 IP & Port
		InetAddress address = inPacket.getAddress();
		int port = inPacket.getPort();
		
		// 서버의 현재 시간을 시, 분, 초 형태로 반환
		SimpleDateFormat simpleDate = new SimpleDateFormat("[hh:mm:ss]");
		String time = simpleDate.format(new Date());
		outMsg = time.getBytes();
		
		// 패킷을 생성해서 클라이언트한테 전송
		outPacket = new DatagramPacket(outMsg, outMsg.length, address, port);
		}
	}
	
	public static void main(String[] args) {
		try {
			new UDPServer().start(); // UDP 서버 시작
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
