package com.kita.first.level3;

public class Car {
	String name;
	String color;
	int cc;

	public Car() { // 생성자의 기본 특징 : 이름이 클래스 이름이랑 같다. 리턴타입 x 생성자에선 메소드를 소환가능하지만 반대의 경우는 사용불가
		super(); // 생략가능
		System.out.println("Car 기본생성자");

	}

	public Car(String name, String color, int cc) {
		// super();
		this.name = name;
		this.color = color;
		this.cc = cc;
		// this("소나타","흰색",2500); this의 사용법 2번째
	}

	public Car(String name) {// 생성자 출력할시 인수를 전체를 지정안하고 특정한것만 할경우
		// TODO Auto-generated constructor stub
		/*
		 * if(name.equals("그랜저")) { this(name,"흰색",0); }
		 */
		this(name, "???", 0);
	}

	public Car(String name, String color) {
		this(name, color, 0);
	}

	public Car(int cc) {
		this("???", "???", cc);
	}

	public void introduceMyCar() {
		System.out.printf("%s의 컬러는 %s이고 %dcc이다", name, color, cc);
		System.out.println();
	}

	public void name() {

	}

	public void color() {

	}

	public void cc() {

	}
}
