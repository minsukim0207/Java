package com.kh.instance.cafe;

public class CafeMain {

	public static void main(String[] args) {

		Cafe client1 = new Cafe("Americano", 1, true);
		Cafe client2 = new Cafe("Latte", 2, true);
		Cafe client3 = new Cafe("Flat White", 1, false);
		
		client1.makeCoffee();
		client2.makeCoffee();
		client3.makeCoffee();
	}

}
