package com.kh.api.exam1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
/*
 * Date
 * 날짜와 시간 정보를 나타내는데 사용
 * java1.1 이후 권장되지 않음
 * java.time 패키지 LocalDate, LocalTime, LocalDateTime
 */
	public static void main(String[] args) {

		LocalDate currentDate = LocalDate.now();
		System.out.println("현재 날짜: " + currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("현재 시간: " + currentTime);
		
		LocalDateTime cDateTime = LocalDateTime.now();
		System.out.println("현재 날짜와 시간: " + cDateTime);
		
		// 날짜 계산
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(7);
		System.out.println("7일 후 날짜: " + futureDate);
		
		LocalDate pastDate1 = today.minusDays(3);
		LocalDate pastDate2 = today.minusMonths(3);
		LocalDate futureDate1 = today.plusWeeks(3);
		LocalDate futureDate2 = today.plusYears(3);
		
		System.out.println(pastDate1);
		System.out.println(pastDate2);
		System.out.println(futureDate1);
		System.out.println(futureDate2);
		
		LocalDate date1 = LocalDate.of(2023, 9, 13);
		LocalDate myDate = LocalDate.of(1988, 2, 7);
		
		if (date1.isBefore(myDate)) {
			System.out.println(date1 + "은 " + myDate + "이전입니다.");
		} else if (myDate.isBefore(date1)) {
			System.out.println(myDate + "은 " + date1 + "이전입니다.");
		} else System.out.println(date1 + "과 " + myDate + "는 같은 날짜입니다.");
	}

}
