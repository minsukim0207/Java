package com.kh.finalsample;
import java.util.ArrayList;

public class MyMusic {
	
	public static void main(String[] args) {
		MyMusic m = new MyMusic();
		m.runFruit();
	}

	public void runFruit() {
		ArrayList<Music> list = new ArrayList<Music>();
		list.add(new Music("�߶��", "����"));
		list.add(new Music("��", "�ų�"));
		list.add(new Music("����"));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
