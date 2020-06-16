package com.kita.first.mission;

public class Mission6_3 {
	public static void main(String[] args) {
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.printf("%d * %d = %d ", i, j, i*j);
				System.out.println();
			}
			System.out.println("-----------------");
		}
		for(int i=26; i<34; i++) {
			int temp = i-24;
			for(int j=1; j<10; j++) {
				System.out.printf("%d * %d = %d ", temp, j, temp*j);
				System.out.println();
			}
			System.out.println("-----------------");
		}
		for(int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
				System.out.printf("%d * %d = %d ", j, i, i*j);
			}
			System.out.println();
		}
	}
}
