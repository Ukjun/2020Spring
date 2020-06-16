package com.kita.first.mission;

public class Mission6_1 {
	public static void main(String[] args) {
		int dan = 4;
		for (int i = 15; i <= 23; i++) {
			int result = dan * (i - 14);
			System.out.printf("%d * %d = %d\n", dan, i - 14, result);
		}
		for (int i = 9; i <= 17; i++) {
			int temp = i - 8;
			int result = dan * (temp);
			System.out.printf("%d * %d = %d\n", dan, temp, result);
		}
	}
}
