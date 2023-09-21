package com.kh.arrayjunittest;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import com.kh.arraysample.*;

public class ArrayTest {
	
	ArrayPractice ap = new ArrayPractice();
	
	@Test
	public void test1() {
		int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] actual = ap.practice1();
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void test2() {
		int expected = 10;
		assertEquals(expected, ap.practice1().length);
	}
	
	@Test
	public void test3() {
		int expected = 1;
		int actual = ap.practice1()[0];
		assertEquals(expected, actual);
	}
	
	@Test
	public void test4() {
		int SIZE = 4;
		ArrayPractice arr = new ArrayPractice(SIZE);
		int[] expected = new int[SIZE];
		for (int i = 0; i < expected.length; i++) {
			expected[i] = i;
		}
		int[] actual = arr.getArray();
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void test5() {
		String actual = ap.getStrArray()[0];
		assertEquals("1", actual);
	}
}
