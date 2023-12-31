package com.kh.practice.chap01_poly.controller;
import com.kh.practice.chap01_poly.model.vo.*;

public class LibraryController {
	
	private Member mem;
	public Book[] bList = new Book[5];
	
	{
	bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
	bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
	bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
	bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
	bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}
	
	public void insertMember(Member mem) {
		this.mem = mem;
	}
	
	public Member myInfo() {
		return this.mem;
	}
	
	public Book[] selectAll() {
		return this.bList;
	}
	
	public Book[] searchBook(String keyword) {
		Book[] searchList = new Book[5];
		int count = 0;
		for (int i = 0; i < this.bList.length; i++) {
			if (bList[i].getTitle().contains(keyword)) {
				searchList[count++] = bList[i];
			} else continue;
		}
		return searchList;
	}
	
	public int rentBook(int index) {
		
		int result = 0;
		
		if (bList[index] == bList[1] || bList[index] == bList[2]) {
			if (mem.getAge() < bList[index].getAccessAge()) {
				result = 1;
			} else result = 2;
		} else {
			if (bList[index].getCoupon()) {
				mem.setCouponCount(mem.getCouponCount() + 1);
				result = 2;
			} else result = 2;
		}
		
		return result;
	}
}
