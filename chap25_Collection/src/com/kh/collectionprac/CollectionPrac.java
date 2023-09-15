package com.kh.collectionprac;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionPrac {

	public static void main(String[] args) {
		CollectionPrac p = new CollectionPrac();
		
		p.prac1();
		System.out.println();
		p.prac2();
		System.out.println();
		p.practiceMap();
	}
	
	public void prac1() {
		List<String> ml = new ArrayList<>();
		
		ml.add("A");
		ml.add("b");
		ml.add("c");
		ml.add("b");
		
		for (String c : ml) {
			System.out.print(c);
		}
	}
	
	public void prac2() {
		Set<String> ms = new HashSet<>();
		
		ms.add("D");
		ms.add("E");
		ms.add("F");
		ms.add("E");
		
		for (String c : ms) {
			System.out.print(c);
		}
	}
	
	public void practiceMap() {
		Map<String, String> mm = new HashMap<>();
		
		mm.put("�ѱ�", "����");
		mm.put("����", "���");
		mm.put("�Ϻ�", "����");
		mm.put("�ѱ�", "����");
		
		for (String country : mm.keySet()) {
			String city = mm.get(country);
			System.out.println(city + " " + country);
		}
	}

}