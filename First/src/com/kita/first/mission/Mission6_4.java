package com.kita.first.mission;

public class Mission6_4 {
	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
				System.out.printf("%d * %d = %d\t", j, i, i*j); // print에서 수평 정렬을 사용할때 \t를 사용하면 정렬이 된다!!!!
			}
			System.out.println();
		}
	}
}
