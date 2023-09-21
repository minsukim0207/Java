package com.kh.finalsample;
import java.util.ArrayList;

public class MyMusic {
	
	public static void main(String[] args) {
		MyMusic m = new MyMusic();
		m.runFruit();
	}

	public void runFruit() {
		ArrayList<Music> list = new ArrayList<Music>();
		list.add(new Music("¹ß¶óµå", "½½ÇÄ"));
		list.add(new Music("´í½º", "½Å³²"));
		list.add(new Music("À½¾Ç"));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
