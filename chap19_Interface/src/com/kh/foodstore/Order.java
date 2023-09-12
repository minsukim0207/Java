package com.kh.foodstore;
import java.util.List;
import java.util.ArrayList;

public class Order implements FoodStore {

	private List<Menu> OrderMenus;
	
	public Order() {
		OrderMenus = new ArrayList<>();
	}
	
	@Override
	public void addMenu(String menu) {
		Menu menuA = new Menu(menu);
		OrderMenus.add(menuA);
	}
	
	@Override
	public void removeMenu(String menu) {
		System.out.println(menu);
	}
	
	@Override
	public void printMenu() {
		System.out.println("주문 내역");
		for (Menu menu : OrderMenus) {
			System.out.println(menu.getItem());
		}
	}
}
