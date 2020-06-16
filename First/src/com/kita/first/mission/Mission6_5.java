package com.kita.first.mission;

import java.util.Scanner;

public class Mission6_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		String str = scanner.next();
		char ch = '*';
		int num = Integer.parseInt(str);
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		for(int i=0; i<num*num; i++) {
			if(i%num==0) {
				System.out.println();
			}
		}
		
	}
}
