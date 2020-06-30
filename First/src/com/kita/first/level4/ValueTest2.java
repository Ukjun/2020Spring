package com.kita.first.level4;


public class ValueTest2 {
	public static void main(String[] args) {
		String str = new String("안녕");
		System.out.println("str: " +str);
		System.out.println();
		Value val = new Value(2000);
		System.out.println("val : "+val);
		
		String strVal = String.valueOf(val);
		String strVal2 = strVal.toString();
		String strVal3 = val.toString();
		System.out.println(strVal2);
		System.out.println(strVal3);
	}	
}
