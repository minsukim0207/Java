package com.kh.finalsample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileMain {

	public void fileSave(String fileName, Food food) {
		// ���޹��� fileName���� ���� ��ü ����
		try {
			FileOutputStream foutStream = new FileOutputStream(fileName);
			
			// ���� ��ü�� �����ϴ� ���� ��� ��Ʈ�� ����
			try {
				ObjectOutputStream objStream = new ObjectOutputStream(foutStream);
				
				// ���Ͽ� Food ��ü�� ���
				objStream.writeObject(food);
				
				// ��Ʈ�� ����
				objStream.close();
				foutStream.close();
				
				System.out.println("Food ��ü�� ���Ͽ� �����߽��ϴ�.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		FileMain fm = new FileMain();
		Food foodSample = new Food("���", 20);
		fm.fileSave("food.txt", foodSample);
	}
}
