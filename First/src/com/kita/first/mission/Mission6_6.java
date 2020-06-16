package com.kita.first.mission;

import java.util.Scanner;

public class Mission6_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		int star = Integer.parseInt(str);
		for(int i=1; i<=star; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int temp =1;
		for(int i=1; i<=star*star; i++) {
			if(i%star<temp) {
				System.out.print("*");
			}else {
				temp++;
			}
			if(i%star==0)
				System.out.println();
		}
	}
}
