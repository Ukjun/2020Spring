package com.kita.first;

public class If1 {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		if(n1>n2) {
			System.out.println("n1이 n2보다 크다");
		}
		else if(n1==n2) {
			System.out.println("n1과 n2는 같다");
		}
		else {
			System.out.println("n2가 n1보다 크다");
		}
		System.out.println("끝");
	}
}
