package com.kh.randommain;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.HashSet;

/*
 * Random
 * ���� ���� Ŭ����
 */

public class RandomMain {

	public static void main(String[] args) {
		// �ζ� ��ȣ ������
		RandomMain rm = new RandomMain();
		rm.Lotto();
	}
	
	public void Lotto() {
		Random rd = new Random();
		int NUMBER_OF_LOTTO = 6;
		
		HashSet<Integer> lottoNum = new HashSet<>();
		
		// �ߺ��� ���ϱ� ���� Set ���
		while (lottoNum.size() < NUMBER_OF_LOTTO) {
		// 1~45 ���� ���� ����
			int randomNum = rd.nextInt(45) + 1;
			lottoNum.add(randomNum);
		}

		System.out.println("�ζ� ��ȣ: " + lottoNum);
	}
	/*
	public void RandomExam() {
		
		// ���� ���� ������ ������ ���� ����
		int randomInt = rd.nextInt(100); // 0~99
		System.out.println(randomInt);
		
		// �Ǽ� ���� ������ ������ ���� ����
		double randomDouble = rd.nextDouble();
		System.out.println(randomDouble);
		
		// ��, ���� ����
		boolean randomBoolean = rd.nextBoolean();
		System.out.println(randomBoolean);
	}
	*/
}
