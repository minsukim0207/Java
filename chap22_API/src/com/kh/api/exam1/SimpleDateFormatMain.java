package com.kh.api.exam1;
import java.util.Date;
import java.text.SimpleDateFormat;

public class SimpleDateFormatMain {
/*
 * SimpleDateFormat
 * ��¥�� �ð��� ���ϴ� �������� �������ϰų� ���ڿ��κ��� ��¥�� �ð��� �Ľ��ϴµ� ���
 * yyyy-MM-dd HH:mm:ss
 * y : ����
 * M : ��
 * d : ��
 * H : ��
 * m : ��
 * s : ��
 */
	public static void main(String[] args) {

		Date currentDate = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String forDate = sdf.format(currentDate);
		
		System.out.println(forDate);
		
	}

}
