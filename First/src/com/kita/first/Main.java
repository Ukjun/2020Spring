package com.kita.first;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 숫자아구 시작
		Random ran = new Random();
		int[] com = new int[3];
		int[] player = new int[3];
		int strike, ball;
		int count=0;
		int check_count= 1;
		boolean[] check = new boolean[10];
		for(int i=0; i<10; i++) {
			check[i] = false;
		}
		while(count<3) {
			int num = ran.nextInt(10);
			if(!check[num]) {
				com[count] = num;
				check[num] = true;
				count++;
			}
		}
		while(true) {
			strike=ball=0;
			System.out.print("0~9 사이의 세 정수를 입력하시오 : ");
			for(int i=0; i<3; i++) {
				player[i] = scanner.nextInt();
				for(int j=0; j<3; j++) {
					if(player[i]==com[j]&&i==j) {
						strike++;
					}else if(player[i]==com[j]&&i!=j) {
						ball++;
					}
				}	
			}
			System.out.println(check_count+"번째");
			if(strike==0&&ball==0) {
				System.out.println("아웃");
			}else {
				System.out.println(strike + "스트라이크 "+ ball + "볼");
			}
			check_count++;
			if(strike==3) {
				break;
			}
		}
		for(int i=0; i<3; i++) {
			System.out.print(com[i]+ " ");
		}
		
		scanner.close();
	}
}
