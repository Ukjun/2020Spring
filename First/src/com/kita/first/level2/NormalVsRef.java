package com.kita.first.level2;

public class NormalVsRef {
	public static void main(String[] args) {
		int num = 10;
		System.out.println("before num: "+num);
		changeVal(num);
		System.out.println("change num: "+num);
		int[] numArr = {10};
		System.out.println("before numArr: "+numArr[0]);
		System.out.println("before numArr: "+numArr);
		changeVal(numArr);
		System.out.println("change numArr: "+numArr[0]);
		System.out.println("change numArr: "+numArr);
		
	}
	
	public static void changeVal(int[] numArr) {
		numArr[0] = 30;
	}
	public static void changeVal(int num) {
		num = 30;
	}
}
