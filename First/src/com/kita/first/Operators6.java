package com.kita.first;

public class Operators6 {
	public static void main(String[] args) {
		String str1 = new String("name");
		String str2 = "name";
		String str3 = str2;
		boolean result = str2.equals(str1);
		System.out.println(result);
		System.out.println(str1==str2);
		System.out.println("name".equals(str1));
	}
}
