package com.kh.fileio;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImgResizeMain {

	public static void main(String[] args) {
		// 원본 이미지 파일 경로 설정하고 이미지 리사이즈 파일 경록 설정
		String path = "C:\\users\\user1\\Desktop\\";
		String imputImg = path + "Java.jpg";
		String outputImg = path + "resizeJava.jpg";
		
		// 리사이즈할 이미지 크기 설정
		int width = 200;
		int height = 150;
		
		try {
			// 원본 이미지 읽어오기
			BufferedImage origin = ImageIO.read(new File(imputImg));
			// 새로운 크기로 이미지 리사이즈
			Image resizeImg = origin.getScaledInstance(width, height, Image.SCALE_SMOOTH);
			// BufferedImage 변환
			BufferedImage bufResizeImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			bufResizeImg.getGraphics().drawImage(resizeImg, 0, 0, null);
			// 리사이즈된 이미지 파일로 저장
			ImageIO.write(bufResizeImg, "jpg", new File(outputImg));
			System.out.println("이미지 리사이즈 완료");
		} catch (IOException e) {
			System.out.println("이미지 리사이즈 오류 발생: " + e.getMessage());
		}
	}
}
