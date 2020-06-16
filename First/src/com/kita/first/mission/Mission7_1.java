package com.kita.first.mission;

import java.util.Scanner;

public class Mission7_1 {
	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);
		//String str = scanner.next();
		//int num = Integer.parseInt(str);
		int sum = 0;
		int sum2 =0;
		int count=0;
		int count2 =0;
		while(count<=100) {
			sum += count;
			count++;
		}
		System.out.println(sum);
		while(count2++<=100)
		{
			if(count2%2==0) {
				sum2 += count2;			
			}			
		}
		System.out.println("합계 " + sum2);
		
	}
}
