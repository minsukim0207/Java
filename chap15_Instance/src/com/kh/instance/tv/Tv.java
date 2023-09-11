package com.kh.instance.tv;

public class Tv {
	// Tv 속성 (필드)
	String color;
	boolean power;
	int channel;
	
	// Tv 기능 (메서드)
	
	public void power() {
		power = !power;
	}
	
	public void channelUp() {
		++channel;
	}
	
	public void channelDown() {
		--channel;
	}
}
