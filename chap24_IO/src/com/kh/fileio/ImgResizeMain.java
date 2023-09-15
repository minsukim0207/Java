package com.kh.fileio;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImgResizeMain {

	public static void main(String[] args) {
		// ���� �̹��� ���� ��� �����ϰ� �̹��� �������� ���� ��� ����
		String path = "C:\\users\\user1\\Desktop\\";
		String imputImg = path + "Java.jpg";
		String outputImg = path + "resizeJava.jpg";
		
		// ���������� �̹��� ũ�� ����
		int width = 200;
		int height = 150;
		
		try {
			// ���� �̹��� �о����
			BufferedImage origin = ImageIO.read(new File(imputImg));
			// ���ο� ũ��� �̹��� ��������
			Image resizeImg = origin.getScaledInstance(width, height, Image.SCALE_SMOOTH);
			// BufferedImage ��ȯ
			BufferedImage bufResizeImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			bufResizeImg.getGraphics().drawImage(resizeImg, 0, 0, null);
			// ��������� �̹��� ���Ϸ� ����
			ImageIO.write(bufResizeImg, "jpg", new File(outputImg));
			System.out.println("�̹��� �������� �Ϸ�");
		} catch (IOException e) {
			System.out.println("�̹��� �������� ���� �߻�: " + e.getMessage());
		}
	}
}
