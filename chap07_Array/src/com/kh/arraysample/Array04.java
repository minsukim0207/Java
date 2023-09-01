package com.kh.arraysample;

public class Array04 {

	public static void main(String[] args) {
		
		String[] inturnArray = {"¹ÚÇÑ³ª", "±è¸»¶Ë", "È«±æµ¿", "¹ÚÃ¶¼ö", "ÇãÇãÇã"};
		
		inturnArray[3] = "±è¹Î¼ö";
		
		System.out.println(inturnArray[3]);
		
		String[] fruitArray = {"»ç°ú", "µþ±â", "Å°À§", "¸Þ·Ð", "±Ö"};
		
		fruitArray[0] = "¹Ù³ª³ª";
		fruitArray[1] = "¼ö¹Ú";
		fruitArray[2] = "·¹¸ó";
		fruitArray[3] = "±Ö";
		fruitArray[4] = "¿À·»Áö";
		
	}

}