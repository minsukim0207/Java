package com.kh.inheritance.animal;

public class AnimalMain {

	public static void main(String[] args) {
		
		Dog myDog = new Dog("�����");
		
		myDog.info();
		myDog.speak();
		
		Cat myCat = new Cat("�����");
		myCat.info();
		myCat.run();
		
		Lion myLion = new Lion("����");
		myLion.info();
		myLion.eat();
		
		Monkey myMonkey = new Monkey("������");
		myMonkey.info();
		myMonkey.sleep();
	}

}
