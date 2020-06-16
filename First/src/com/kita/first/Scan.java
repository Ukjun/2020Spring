package com.kita.first;

import java.util.*;

public class Scan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름? ");
		int num = scanner.nextInt();
		String name = scanner.nextLine();
		System.out.println("이름 :" + name);
		scanner.close();
	}
}
