package com.kita.first.Practice;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int count;
		if(b>=c) {
			count= -1;
		}else {
			count = a/(c-b)+1;
		}
		System.out.println(count);
	}
}
