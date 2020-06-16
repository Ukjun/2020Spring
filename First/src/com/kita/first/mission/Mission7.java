package com.kita.first.mission;

import java.util.Scanner;

public class Mission7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		while(true) {
			System.out.print("숫자를 입력(종료:0): ");
			String str = scanner.next();
			int num = Integer.parseInt(str);
			
			if(num==0) {
				System.out.printf("합계 : %d", sum);
				break;
			}else if(num%2==0 ){
				sum += num;
			}
		}
		scanner.close();
	}
}
