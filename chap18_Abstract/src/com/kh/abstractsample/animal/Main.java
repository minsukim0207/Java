package com.kh.abstractsample.animal;

public class Main {

	public static void main(String[] args) {
		
		Dog dog = new Dog("강아지");
		Cat cat = new Cat("고양이");
		
		Animal[] animals = new Animal[2];
		animals[0] = dog;
		animals[1] = cat;
		
		for (Animal animal : animals) {
			animal.displayName();
			animal.makeSound();
		}
	}

}
