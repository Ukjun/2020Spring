package com.kita.first.level4;

public class Animal {
	private String name;
	private String type;
	protected Animal(String name, String type) {
		this.name = name;
		this.type = type;
		System.out.printf("이름은 %s 종은 %s",name, type);
		System.out.println();
	}
	void crying() {
		System.out.println("울다.");
	}
	void eat() {
		System.out.println("먹다.");
	}
	void whoami() {
		System.out.printf("나는 %s 입니다.",name);
	}
}

