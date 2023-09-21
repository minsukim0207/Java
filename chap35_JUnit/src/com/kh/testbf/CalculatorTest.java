package com.kh.testbf;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator cal;

	@Before
	public void setUp() {
		// �� �׽�Ʈ �޼��� ���� ���� ������ �۾� ����
		cal = new Calculator();
		System.out.println("�׽�Ʈ ����");
	}
	
	@After
	public void tearDown() {
		// �� �׽�Ʈ �޼��� ���� �� ������ �۾� ����
		System.out.println("�׽�Ʈ ����");
	}
	
	@Test
	public void testAddiction( ) {
		int result = cal.add(3, 4);
		assertEquals(7, result);
	}
	
	@Test
	public void testSub() {
		int result = cal.subtract(4, 3);
		assertEquals(1, result);
	}
}