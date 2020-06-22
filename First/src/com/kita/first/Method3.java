package com.kita.first;

public class Method3 {
	public static void main(String[] args) {
		int result = minus(8,10);
		System.out.println(result);
	}
	public static int sum(int n1,int n2) {
		return n1+n2;
	}
	public static int minus(int n1,int n2) {
		if(n1>=n2) {
			return n1-n2;
		}else {
			return n2-n1;
		}
	}
}
