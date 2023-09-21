package com.kh.testsample;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAddition() {
		Calculator cal = new Calculator();
		int result = cal.add(1, 2);
		assertEquals(3, result); // 예상값과 실제 결과값 비교
	}
	
	@Test
	public void testSubtract() {
		Calculator cal = new Calculator();
		int result = cal.subtract(5, 2);
		assertEquals(3, result);
	}
}
