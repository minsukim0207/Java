package com.kh.example.practice7.model.vo;
import java.util.Random;

public class Lotto {
	int[] lotto = new int[6];
	
	public int[] getLotto() {
		return lotto;
	}

	public void setLotto(int[] lotto) {
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
	}

	Random random = new Random();
	
	public Lotto() { // �ߺ� ������ �ζ� ��ȣ �ʱ�ȭ
		this.setLotto(lotto);
	}
	
	public void information() { // ��ȣ ���
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
}
