package com.kita.first.level4;

public class Bird extends Animal {
	
	
	protected Bird(String name) {
		super(name,"조류");
	}
	void flying() {
		System.out.println("날다");
	}
	@Override	//	실수를 방지하기 위해서
	void crying() {
		//super();
		super.crying();
		System.out.println("짹짹");
	}

}
