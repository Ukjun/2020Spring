package com.kita.first;

public class ConditionOperator {
	public static void main(String[] args) {
		int num=3;
		boolean isOdd = (num%2 ==1? true: false);
		System.out.printf("%d is odd? %b\n",num,isOdd);
		
		String isOdd2 = (num%2 ==1? "참": "거짓");
		System.out.printf("%d is odd? %s\n",num,isOdd2);
		
	}
}
