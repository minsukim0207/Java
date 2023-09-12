package com.kh.foodstore;

public class Main {

	public static void main(String[] args) {
		
		FoodStore order = new Order();
		order.addMenu("Â¥Àå¸é");
		order.addMenu("Â«»Í");
		order.addMenu("ÅÁ¼öÀ°");
		
		order.printMenu();
	}

}
