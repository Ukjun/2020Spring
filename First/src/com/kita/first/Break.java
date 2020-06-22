package com.kita.first;

public class Break {
	public static void main(String[] args) {
		for(int i=0; i<100; i++) {
			System.out.println(i);
			if(i%10==0) {
				continue; // 반복문은 종료하지않고 맨밑으로 가라는 명령어
			}
			System.out.println("메롱");
		}
	}
}
