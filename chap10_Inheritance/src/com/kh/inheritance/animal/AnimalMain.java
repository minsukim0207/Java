package com.kh.inheritance.animal;

public class AnimalMain {

	public static void main(String[] args) {
		
		Dog myDog = new Dog("´ó´óÀÌ");
		
		myDog.info();
		myDog.speak();
		
		Cat myCat = new Cat("°í¾çÀÌ");
		myCat.info();
		myCat.run();
		
		Lion myLion = new Lion("»çÀÚ");
		myLion.info();
		myLion.eat();
		
		Monkey myMonkey = new Monkey("¿ø¼şÀÌ");
		myMonkey.info();
		myMonkey.sleep();
	}

}
