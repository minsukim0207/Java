package com.kh.finalsample;

public class Music {

	private String music, emo;
	
	public Music(String music, String emo) {
		this.music = music;
		this.emo = emo;
	}
	
	public Music(String music) {
		this.music = music;
		this.emo = "����";
	}
	
	@Override
	public String toString() {
		return "����: " + music + " ����: " + emo;
	}
}
