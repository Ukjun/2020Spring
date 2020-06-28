package com.kita.first.level4;

public class ValueTest {
	public static void main(String[] args) {
		String str = new String("A");
		String str2 = new String("A");
		System.out.println("1: "+ (str==str2));
		System.out.println("2: "+str.equals(str2));
		Value val = new Value(1);
		Value val2 = new Value(1);
		System.out.println("3: "+ (val==val2));
		System.out.println("4: "+val.equals(val2));
	}
}
