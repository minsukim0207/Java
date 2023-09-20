package com.kh.iaddressprac;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressPrac {

	public static void main(String[] args) {
		InetAddressPrac inetPrac = new InetAddressPrac();
		inetPrac.inetSample();
	}
	
	public void inetSample() {
		try {
			InetAddress google = InetAddress.getByName("www.google.com");
			
			// Local Host
			InetAddress localHostName = InetAddress.getLocalHost();
			System.out.println("Local Host Name: " + localHostName);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
