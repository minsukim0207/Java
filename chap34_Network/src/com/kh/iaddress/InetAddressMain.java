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
			// 호스트 이름 이용해서 객체 생성
			InetAddress google = InetAddress.getByName("www.google.com");
					
			// IP 주소 출력
			System.out.println("Host Name: " + google.getHostName());
			System.out.println("IP Address: "+ google.getHostAddress());
					
			// 현재 호스트 InetAddress 객체 얻기
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
		// 호스트이름 가져와서 객체 생성
		try {
			InetAddress address = InetAddress.getByName("www.google.com");
			
			// InetAddress 객체에서 IP 주소를 byte 배열로 얻기
			// IP 주소를 바이트 배열로 얻으면 각 바이트를 통해 IP 주소를 다룰 수 있음
			byte[] ipAddress = address.getAddress();
			System.out.println("IP Address -> bytes");
			for (byte ip : ipAddress) {
				System.out.print(ip + ".");
			}
			System.out.println();
			
			// 도메인 명에 지정된 모든 호스트의 IP 주소를 배열로 얻기
			InetAddress[] allAddress = InetAddress.getAllByName("www.google.com");
			System.out.println("구글에 지정된 모든 호스트의 IP주소를 배열로 얻음");
			for (InetAddress addr : allAddress) {
				System.out.println(addr.getHostAddress());
			}
			
			// 호스트 명 얻기
			String hostName = address.getHostName();
			System.out.println("Host Name: " + hostName);

			// 지역 호스트의 IP 주소 얻기
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("Local Host address: " + localHost.getHostAddress());

			// 멀티 캐스트 주소 여부 확인
			boolean isMultiCast = address.isMulticastAddress();
			System.out.println("멀티 캐스트 주소입니까? " + isMultiCast);

			// 호스트 명을 이용해서 InetAddress 객체 얻기
			InetAddress name = InetAddress.getByName("www.naver.com");
			System.out.println("IP Address: " + name.getHostAddress());
			
			// 호스트의 완전한 이름 가져오기 (전체 도메인 이름)
			// 호스트의 정규화된 (FQDN) 도메인 이름을 얻음
			// FQDN: Full Qualified Domain Name
			String hostFullName = address.getCanonicalHostName();
			System.out.println("Full Name: " + hostFullName);
			
			// Looppack 주소 여부 확인
			boolean isLoopback = address.isLoopbackAddress();
			System.out.println("Loopback? " + isLoopback);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
