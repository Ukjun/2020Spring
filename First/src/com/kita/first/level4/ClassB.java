package com.kita.first.level4;

public class ClassB extends ClassA{
	public ClassB() {
		super();
		System.out.println("여기는 클래스B");
	}
	
	@Override
	void print() {
		System.out.println("B");
	}
}
