package com.kh.udpserver;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
// UDP ���� Ŭ����
public class UDPClient {
	// UDP ����
	public void start() throws Exception {
		// ���� ����
		DatagramSocket dataSocket = new DatagramSocket();
		// 127.0.0.1 localhost Ŭ���̾�Ʈ�� ������ ���� ��ǻ�Ϳ��� ���� ���� ������ ����
		// ��Ʈ��ȣ ������ server���� �����ϰ�, �������� ������ ��Ʈ�� ��
		InetAddress serverAddress = InetAddress.getByName("127.0.0.1"); // getAllByName Ȯ��
		
		// �����Ͱ� ����� ������ ������ ������ ũ��� byte �迭 ����
		byte[] msg = new byte[200];
		// ������ �����͸� �۽�
		DatagramPacket outPacket = new DatagramPacket(msg, 1, serverAddress, 6666);
		// �����κ��� �����͸� ����
		DatagramPacket inPacket = new DatagramPacket(msg, msg.length);
		
		// DatagramPacket�� ����
		dataSocket.send(outPacket);
		// DatagramPacket�� ����
		dataSocket.receive(inPacket);
		// ���ŵ� �����͸� ���ڿ��� ��ȯ�Ͽ� ������ ���� �ð��� ���
		System.out.println("������ ���� �ð�: " + new String(inPacket.getData()));
		
		// Ŭ���̾�Ʈ�� ������ �ݾ� ���� ����
		dataSocket.close();
	}
	
	public static void main(String[] args) {
		try {
			new UDPClient().start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
