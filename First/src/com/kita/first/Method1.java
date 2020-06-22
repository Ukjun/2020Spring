package com.kita.first;

public class Method1 {
	public static void main(String[] args) {
		Method1 cal = new Method1(); 
		cal.hello(10,15);
		cal.minus(20, 5);
	}
	public void hello(int n1, int n2) {
		System.out.println(n1+n2);
		return;
	}
	public void minus(int n1, int n2) {
		System.out.println(n1-n2);
	}
	public String a(String str) {
		
		return str;
	}
}
