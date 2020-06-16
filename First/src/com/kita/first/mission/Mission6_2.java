package com.kita.first.mission;

import java.util.Scanner;

public class Mission6_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("출력하실 갯수를 입력하세요: ");
		String star = scanner.next();
		int num = Integer.parseInt(star);
		for (int i = 0; i < num; i++) {
			System.out.print("* ");
		}
		scanner.close();
	}
}
