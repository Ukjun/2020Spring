package com.kita.first.level3;

public class Monitor {
	static String brand="삼성";  //static: 값이 하나 밖에 저장이 안된다. 공용으로 사용 static붙은 변수끼리만 사용가능
	int inch;
	void printInfo() {
		System.out.printf("brand: %s, inch: %d\n",brand,inch);
	}
	static void printBrand() {
		System.out.println(brand);
	}
	void printInch() {
		System.out.println(brand);
		System.out.println(inch);
	}
}
