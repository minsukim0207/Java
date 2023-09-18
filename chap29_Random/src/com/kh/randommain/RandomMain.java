package com.kh.randommain;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.HashSet;

/*
 * Random
 * 난수 생성 클래스
 */

public class RandomMain {

	public static void main(String[] args) {
		// 로또 번호 생성기
		RandomMain rm = new RandomMain();
		rm.Lotto();
	}
	
	public void Lotto() {
		Random rd = new Random();
		int NUMBER_OF_LOTTO = 6;
		
		HashSet<Integer> lottoNum = new HashSet<>();
		
		// 중복을 피하기 위해 Set 사용
		while (lottoNum.size() < NUMBER_OF_LOTTO) {
		// 1~45 사이 난수 생성
			int randomNum = rd.nextInt(45) + 1;
			lottoNum.add(randomNum);
		}

		System.out.println("로또 번호: " + lottoNum);
	}
	/*
	public void RandomExam() {
		
		// 정수 범위 내에서 랜덤인 난수 생성
		int randomInt = rd.nextInt(100); // 0~99
		System.out.println(randomInt);
		
		// 실수 범위 내에서 랜덤인 난수 생성
		double randomDouble = rd.nextDouble();
		System.out.println(randomDouble);
		
		// 참, 거짓 랜덤
		boolean randomBoolean = rd.nextBoolean();
		System.out.println(randomBoolean);
	}
	*/
}
