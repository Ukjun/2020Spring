package com.kita.first.level3;

public class CalcTest {
	public static void main(String[] args) {
		// Calc cal = new Calc();
		System.out.println(Calc.sum(10, 20));

		Calc cal = new Calc();
		cal.n1 = 20;
		cal.n2 = 30;
		System.out.println(cal.sum());
	}
}
