package com.kita.first.mission;

import java.util.Scanner;

public class MethodMission1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		String str2 = scanner.next();
		int num = Integer.parseInt(str);
		int num2 = Integer.parseInt(str2);
		//guguDan(num);
		guguDan(num,num2);
		scanner.close();
	}
	public static void guguDan(int a, int b) {
		if(a<=b) {
			for(int i=a; i<=b; i++) {
				guguDan(i);
				System.out.println();
			}
		}
		else {
			System.out.println("오류");
		}
	}
	public static void guguDan(int a) {
		for(int i=1; i<10; i++) {
			System.out.printf("%d * %d = %d \t",a,i,a*i);
		}	
	}
}
