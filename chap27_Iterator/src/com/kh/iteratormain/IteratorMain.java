package com.kh.iteratormain;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMain {
/*
 * Iterator
 * 컬렉션을 반복(Iterate)하면서 요소에 접근하는데 사용되는 인터페이스
 * 다양한 컬렉션 유형(ArrayList, HashSet, HashMap 등)에 사용 가능
 * 컬렉션의 요소를 읽고 삭제하는데 사용
 * 컬렉션의 크기나 내부 구조에 관계없이 요소에 접근 가능
 */
	public static void main(String[] args) {

		// ArrayList 생성 및 요소 추가
		ArrayList<String> music = new ArrayList<>();
		music.add("발라드");
		music.add("댄스");
		music.add("트로트");
		
		// Iterator 생성
		Iterator<String> iter = music.iterator();
		
		// Iterator 사용하여 요소 반복
		while (iter.hasNext()) {
			String msc = iter.next();
			System.out.println(msc);
		}
		
		iter = music.iterator(); // Iterator 초기화
		while (iter.hasNext()) {
			String msc = iter.next();
			if (msc.equals("트로트")) {
				iter.remove();
			}
			System.out.println(msc);
		}
		
		System.out.println("삭제 후 출력");
		for (String m : music) {
			System.out.println(m);
		}
	}
}