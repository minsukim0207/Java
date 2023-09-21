package com.kh.finalsample;
import java.io.Serializable;

public class Food implements Serializable {

	private String name;
	private int kcal;
	
	public Food() {
		
	}
	
	public Food(String name, int kcal) {
		this.name = name;
		this.kcal = kcal;
	}
	
	public String getName() {
		return name; 
	}
	
	public int getKcal() {
		return kcal;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void intKcal(int kcal) {
		this.kcal = kcal;
	}
	
	@Override
	public String toString() {
		return "�̸�: " + name + " Į�θ�: " + kcal;
	}
}
