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
			System.out.println("폴더 생성");
		} else {
			System.out.println("폴더 존재");
		}
		
		try {
			BufferedImage origin = ImageIO.read(new File(inputImg));
			Image resizeImg = origin.getScaledInstance(width, height, Image.SCALE_SMOOTH);
			BufferedImage bufResizeImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			bufResizeImg.getGraphics().drawImage(resizeImg, 0, 0, null);
			ImageIO.write(bufResizeImg, "jpg", new File(outputImg));
			System.out.println("이미지 리사이즈 완료");
		} catch (IOException e) {
			System.out.println("이미지 리사이즈 오류 발생" + e.getMessage());
		}
	}
}
