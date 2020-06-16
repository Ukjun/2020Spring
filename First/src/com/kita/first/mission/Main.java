package com.kita.first.mission;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
			public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				int num1 = scanner.nextInt();
				int num2 = scanner.nextInt();
				int check = 0;
				int a[] = new int[num1];
				
				//System.out.println(num2);
				for(int i=0; i<num1; i++) {
					a[i] = scanner.nextInt();
				}
				
				
				//int range = (int)(a[0]-0.5+num2); // 첫구간 테이빙 칠하는 범위 
				Arrays.sort(a);
				int min = a[0];
				check++;
				
				for(int i=1; i<a.length; i++) { // 테이핑 하는 구간 계산 
					if(a[i]-min>num2-1) {
						min = a[i];
						check++;
					}
				}
				
				System.out.println(check);
				scanner.close();
			}
}
