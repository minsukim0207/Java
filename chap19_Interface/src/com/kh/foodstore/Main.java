package com.kh.foodstore;

public class Main {

	public static void main(String[] args) {
		
		FoodStore order = new Order();
		order.addMenu("¥���");
		order.addMenu("«��");
		order.addMenu("������");
		
		order.printMenu();
	}

}
