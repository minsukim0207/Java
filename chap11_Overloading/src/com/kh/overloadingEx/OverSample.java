package com.kh.overloadingEx;

public class OverSample {
	
	public double multiply(double a, double b) {
		return a * b;
	}
	
	public float multiply(float a, float b, float c) {
		return a * b * c;
	}
	
	public int multiply(int a, int b, int c, int d) {
		return a * b * c * d;
	}
	
	public double multiply(int a, int b, int c, int d, int e) {
		return a * b * c * d * e;
	}
	
	public double multiply(int a, int b, int c, int d, int e, int f) {
		return a * b * c * d * e * f;
	}


	public static void main(String[] args) {

		OverSample obj = new OverSample();
		
		System.out.println(obj.multiply(1.0, 2.0));
		System.out.println(obj.multiply(1, 2, 3));
		System.out.println(obj.multiply(1, 2, 3, 4));
		System.out.println(obj.multiply(1, 2, 3, 4, 5));
		System.out.println(obj.multiply(1, 2, 3, 4, 5, 6));
		}


}
