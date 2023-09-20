package com.kh.iaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain {
	
	public static void main(String[] args) {
		InetAddressMain inetMain = new InetAddressMain();
		inetMain.inetSample();
	}
	
	public void inetExam() {
		try {
			// ȣ��Ʈ �̸� �̿��ؼ� ��ü ����
			InetAddress google = InetAddress.getByName("www.google.com");
					
			// IP �ּ� ���
			System.out.println("Host Name: " + google.getHostName());
			System.out.println("IP Address: "+ google.getHostAddress());
					
			// ���� ȣ��Ʈ InetAddress ��ü ���
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("Local Host Name: " + localHost.getHostName());
			System.out.println("Local IP Address: " + localHost.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
				
		try {
			InetAddress naver = InetAddress.getByName("www.naver.com");
					
			System.out.println("Hose Name: " + naver.getHostName());
			System.out.println("IP Address: " + naver.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

		
	public void inetSample() {
		// ȣ��Ʈ�̸� �����ͼ� ��ü ����
		try {
			InetAddress address = InetAddress.getByName("www.google.com");
			
			// InetAddress ��ü���� IP �ּҸ� byte �迭�� ���
			// IP �ּҸ� ����Ʈ �迭�� ������ �� ����Ʈ�� ���� IP �ּҸ� �ٷ� �� ����
			byte[] ipAddress = address.getAddress();
			System.out.println("IP Address -> bytes");
			for (byte ip : ipAddress) {
				System.out.print(ip + ".");
			}
			System.out.println();
			
			// ������ �� ������ ��� ȣ��Ʈ�� IP �ּҸ� �迭�� ���
			InetAddress[] allAddress = InetAddress.getAllByName("www.google.com");
			System.out.println("���ۿ� ������ ��� ȣ��Ʈ�� IP�ּҸ� �迭�� ����");
			for (InetAddress addr : allAddress) {
				System.out.println(addr.getHostAddress());
			}
			
			// ȣ��Ʈ �� ���
			String hostName = address.getHostName();
			System.out.println("Host Name: " + hostName);

			// ���� ȣ��Ʈ�� IP �ּ� ���
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("Local Host address: " + localHost.getHostAddress());

			// ��Ƽ ĳ��Ʈ �ּ� ���� Ȯ��
			boolean isMultiCast = address.isMulticastAddress();
			System.out.println("��Ƽ ĳ��Ʈ �ּ��Դϱ�? " + isMultiCast);

			// ȣ��Ʈ ���� �̿��ؼ� InetAddress ��ü ���
			InetAddress name = InetAddress.getByName("www.naver.com");
			System.out.println("IP Address: " + name.getHostAddress());
			
			// ȣ��Ʈ�� ������ �̸� �������� (��ü ������ �̸�)
			// ȣ��Ʈ�� ����ȭ�� (FQDN) ������ �̸��� ����
			// FQDN: Full Qualified Domain Name
			String hostFullName = address.getCanonicalHostName();
			System.out.println("Full Name: " + hostFullName);
			
			// Looppack �ּ� ���� Ȯ��
			boolean isLoopback = address.isLoopbackAddress();
			System.out.println("Loopback? " + isLoopback);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
