package com.kh.api.exam1;
import java.util.Date;
import java.text.SimpleDateFormat;

public class SimpleDateFormatMain {
/*
 * SimpleDateFormat
 * 날짜와 시간을 원하는 형식으로 포맷팅하거나 문자열로부터 날짜와 시간을 파싱하는데 사용
 * yyyy-MM-dd HH:mm:ss
 * y : 연도
 * M : 월
 * d : 일
 * H : 시
 * m : 분
 * s : 초
 */
	public static void main(String[] args) {

		Date currentDate = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String forDate = sdf.format(currentDate);
		
		System.out.println(forDate);
		
	}

}
