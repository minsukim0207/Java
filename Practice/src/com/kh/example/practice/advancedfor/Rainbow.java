package com.kh.example.practice.advancedfor;
import java.util.ArrayList;
import java.util.List;

public class Rainbow {

	public static void main(String[] args) {
		
		ArrayList<String> rainbow = new ArrayList<String>();
		
		rainbow.add("빨");
		rainbow.add("주");
		rainbow.add("노");
		rainbow.add("초");
		rainbow.add("파");
		rainbow.add("남");
		rainbow.add("보");
		
		System.out.println(rainbow);
		System.out.println();
		
		System.out.println("수정");
		rainbow.set(1, "블랙");
		rainbow.set(3, "브라운");
		rainbow.set(5, "그린");
		System.out.println(rainbow);
		System.out.println();
		
		System.out.println("추가");
		rainbow.add("옐로우");
		rainbow.add("연한파랑");
		System.out.println(rainbow);
		System.out.println();
		
		System.out.println(rainbow.size());
		
		rainbow.remove(1);
		rainbow.remove(2);
		rainbow.remove(3);
		rainbow.remove(5);
		rainbow.remove(7);
		rainbow.remove(8);
		
		for (String color : rainbow) {
			System.out.print(color + " ");
		}
		
	}

}
