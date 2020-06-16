package com.kita.first.mission;

import java.util.Scanner;

public class Mission6_7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		int star = Integer.parseInt(str);
		for(int i=1; i<=star; i++) {
			for(int j=0; j<star; j++) {
				if(j<star-i) {
					System.out.print(" ");
				}else
					System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
	}
}

