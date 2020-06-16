package com.kita.first.mission;

import java.util.Random;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		//String str = scanner.next();
		//int num = Integer.parseInt(str);
		int com = random.nextInt(91)+10;
		while(true) {
			System.out.print("숫자를 추리하세요: ");
			int player = scanner.nextInt();
			if(com==player) {
				break;
			}
			if(com>player) {
				System.out.println("Up!");
			}else
				System.out.println("Down!");
		}
		System.out.println("Great!! 숫자는 :"+ com);
	}
}
