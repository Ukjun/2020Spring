package com.kita.first.mission;

import java.util.Scanner;

public class Mission5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력해주세요(0~100): ");
		int num = scanner.nextInt();
		int mod = num%10;
		switch(num/10) {
		case 10:
			if(mod>=1) { 
				System.out.println("점수 입력 오류");
			}else
				System.out.println("A+");
			break;
			
		case 9:
			System.out.print("A");
			break;
		case 8:
			System.out.print("B");
			break;
		case 7:
			System.out.print("C");
			break;
		case 6: case 5: case 4: case 3: case 2: case 1:
				System.out.println("D");
				break;
		case 0:
			if(num>=0) {
				System.out.println("D");
			}else
				System.out.println("점수 입력 오류");
		default :
			System.out.println("점수 입력 오류");
		}
		
		if(mod>=7&&num>=70) {
			System.out.println("+");
		}else if (mod <=3&&num>=70) {
			System.out.println("-");
		}
			
	}
}
