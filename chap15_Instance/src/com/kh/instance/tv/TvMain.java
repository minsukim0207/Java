package com.kh.instance.tv;

public class TvMain {

	public static void main(String[] args) {
		
		Tv tv;	// Tv �ν��Ͻ��� �����ϱ� ���� ���� tv�� ����
		tv = new Tv(); // Tv �ν��Ͻ��� �����ؼ� ���� tv�� �Ҵ�
		
		tv.channel = 7; // ���� tv�� ����Ű�� Tv ��ü�� �ν��Ͻ� ���� channel�� ���� 7�� ����
		tv.channelDown(); // ���� tv�� ����Ű�� Tv ��ü�� �޼��� channelDown ȣ��
		tv.power();
	}

}
