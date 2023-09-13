package com.kh.api.exam1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
/*
 * Date
 * ��¥�� �ð� ������ ��Ÿ���µ� ���
 * java1.1 ���� ������� ����
 * java.time ��Ű�� LocalDate, LocalTime, LocalDateTime
 */
	public static void main(String[] args) {

		LocalDate currentDate = LocalDate.now();
		System.out.println("���� ��¥: " + currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("���� �ð�: " + currentTime);
		
		LocalDateTime cDateTime = LocalDateTime.now();
		System.out.println("���� ��¥�� �ð�: " + cDateTime);
		
		// ��¥ ���
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(7);
		System.out.println("7�� �� ��¥: " + futureDate);
		
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
			System.out.println(date1 + "�� " + myDate + "�����Դϴ�.");
		} else if (myDate.isBefore(date1)) {
			System.out.println(myDate + "�� " + date1 + "�����Դϴ�.");
		} else System.out.println(date1 + "�� " + myDate + "�� ���� ��¥�Դϴ�.");
	}

}
