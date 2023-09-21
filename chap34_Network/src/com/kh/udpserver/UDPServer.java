package com.kh.udpserver;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * DatagramSocket
 * UDP ����� ���� ���� Ŭ����
 * UTP ���ϰ� �ٸ��� ������ �����ϰų� ���� ������ �������� �ʰ� ������ ��Ŷ�� �ܼ��� ������ �޴� ����
 * 
 * DatagramPacket
 * UDP ������ ��Ŷ�� ��Ÿ���� Ŭ����
 * �������� ���� ����� �����͸� ���� ��� �Ǵ� �����͸� ������ ����� �ּ� ������ ����
 * 
 * ��Ŷ�̶�?
 * ��ǻ�� ��Ʈ��ũ�� �����ϴ� �������� ����ȭ�� ���
 * �����͸� �ְ� ���� �� ����ϴ� ��Ģ
 * Pack + Bucket
 */
public class UDPServer {

	public void start() throws Exception {
		DatagramSocket socket = new DatagramSocket(6666);
		DatagramPacket inPacket, outPacket;
		byte[] inMsg = new byte[10];
		byte[] outMsg;
	
		while (true) {
		// ������ ������ ���� ��Ŷ ����
		inPacket = new DatagramPacket(inMsg, inMsg.length);
		// ��Ŷ�� ���� �����͸� ����
		socket.receive(inPacket);
		
		// ������ ��Ŷ���� Ŭ���̾�Ʈ�� IP & Port
		InetAddress address = inPacket.getAddress();
		int port = inPacket.getPort();
		
		// ������ ���� �ð��� ��, ��, �� ���·� ��ȯ
		SimpleDateFormat simpleDate = new SimpleDateFormat("[hh:mm:ss]");
		String time = simpleDate.format(new Date());
		outMsg = time.getBytes();
		
		// ��Ŷ�� �����ؼ� Ŭ���̾�Ʈ���� ����
		outPacket = new DatagramPacket(outMsg, outMsg.length, address, port);
		}
	}
	
	public static void main(String[] args) {
		try {
			new UDPServer().start(); // UDP ���� ����
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
