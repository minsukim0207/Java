package com.kh.practice.dimension;

public class DimensionPractice6 {

	public static void main(String[] args) {
		
		String[][] strArr = new String[][] {
			{"이", "까", "왔", "앞", "힘"},
			{"차", "지", "습", "으", "냅"},
			{"원", "열", "니", "로", "다"},
			{"열", "히", "!", "더", "!!"}
		};
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(strArr[j][i] + " ");
			}
		}
	}

}
