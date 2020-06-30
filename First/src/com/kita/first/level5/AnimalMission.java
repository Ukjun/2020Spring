package com.kita.first.level5;

public class AnimalMission {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Sparrow spa = new Sparrow();
		doCry(dog);
		doCry(cat);
		doCry(spa);
	}

	private static void doCry(Animal obj) {
		// TODO Auto-generated method stub
		//Animal obj = ();
		
		obj.cry();
	}
}

