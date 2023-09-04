package com.kh.example.practice2.model.run;
import com.kh.example.practice2.model.vo.*;

public class ProductRun {

	public static void main(String[] args) {
		// Product 3개 생성하고
		// 각각 상품명 가격 브랜드명 출력하기
		
		Product product1 = new Product("아이폰", "애플");
		Product product2 = new Product("맥북", "애플");
		Product product3 = new Product("아이패드", "애플");
		
		product1.information();
		product2.information();
		product3.information();
	}

}
