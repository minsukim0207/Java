package com.kh.practice;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PracticeResize {

	public static void main(String[] args) {
		
		String folderPath = "C:\\users\\user1\\Desktop\\newfolder\\";
		String inputImg = "C:\\users\\user1\\Desktop\\Java.jpg";
		String outputImg = folderPath + "resizeJava.jpg";
		
		int width = 400;
		int height = 300;
		
		File folder = new File(folderPath);
		
		if (!folder.exists()) {
			folder.mkdir();
			System.out.println("���� ����");
		} else {
			System.out.println("���� ����");
		}
		
		try {
			BufferedImage origin = ImageIO.read(new File(inputImg));
			Image resizeImg = origin.getScaledInstance(width, height, Image.SCALE_SMOOTH);
			BufferedImage bufResizeImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			bufResizeImg.getGraphics().drawImage(resizeImg, 0, 0, null);
			ImageIO.write(bufResizeImg, "jpg", new File(outputImg));
			System.out.println("�̹��� �������� �Ϸ�");
		} catch (IOException e) {
			System.out.println("�̹��� �������� ���� �߻�" + e.getMessage());
		}
	}
}
