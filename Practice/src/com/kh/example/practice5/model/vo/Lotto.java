package com.kh.example.practice5.model.vo;
import java.util.Random;

public class Lotto {
	
	int[] lotto = new int[6];
	
	Random random = new Random();
	
	public Lotto() { // 중복 제외한 로또 번호 초기화
		
		for (int i = 0; i < 6; i++) {
			if (i == 0) {
			lotto[i] = (int) (Math.random() * 45);
			} else {
				lotto[i] = (int) (Math.random() * 45);
				for (int j = 0; j < i; j++) {
					if (lotto[j] == lotto[i]) {
						i--;
					}
				}
			}
		}
		/*
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(46);
		}
		
		for (int i = 1; i <= lotto.length; i++) {
			for (int j = 0; j < i; j++) {
				if (lotto[j] == lotto[i]) {
					
				}
			}
		}
		*/
		
	}
	
	public void information() { // 번호 출력
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
}
