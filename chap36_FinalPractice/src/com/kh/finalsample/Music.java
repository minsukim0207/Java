package com.kh.finalsample;

public class Music {

	private String music, emo;
	
	public Music(String music, String emo) {
		this.music = music;
		this.emo = emo;
	}
	
	public Music(String music) {
		this.music = music;
		this.emo = "없음";
	}
	
	@Override
	public String toString() {
		return "종류: " + music + " 감정: " + emo;
	}
}
