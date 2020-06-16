package com.kita.first.mission;

import java.util.Scanner;

public class Mission2 {
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		int num = scanner.nextInt();
		if(num==0) {
			System.out.println("0입니다");
		}
		else if(num %2==0) {
			System.out.println("짝수입니다");
		}
		else
		{
			System.out.println("홀수입니다");
		}
		scanner.close();
	}
}
