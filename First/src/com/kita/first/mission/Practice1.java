package com.kita.first.mission;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 1을 입력 : ");
		String n1 = scanner.next();
		int num1 = Integer.parseInt(n1);
		System.out.print("숫자 2을 입력 : ");
		String n2 = scanner.next();
		int num2 = Integer.parseInt(n2);
		//System.out.printf("%d + %d = %d\n",n1, n2, (n1+n2));
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
	}
}
