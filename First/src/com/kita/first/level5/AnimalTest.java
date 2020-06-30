package com.kita.first.level5;

public class AnimalTest {
	public static void main(String[] args) {
		Animal ani = new Dog();
		ani.cry();
		ani = new Cat();
		ani.cry();

		Cat cat = (Cat)ani;
		cat.cry();
		cat.sleep();//반드시 가르키는 객체가 알고잇는 메소드만 사용가능
	}
}
