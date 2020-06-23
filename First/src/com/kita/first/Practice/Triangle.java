package com.kita.first.Practice;

public class Triangle {
	int a,b,c;
	public void Triangle(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double area() {
		double area = 0;
		double s = (a+b+c)/2;
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return area;
	}
	public void get() {
		if(a==b&&b==c) {
			System.out.println("정삼각형");
		}else if(a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a) {
			System.out.println("직각삼각형");
		}else
			System.out.println("삼각형");
	}
}
