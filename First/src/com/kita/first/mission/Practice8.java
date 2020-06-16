package com.kita.first.mission;

import java.util.Random;
import java.util.Scanner;

public class Practice8 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		// String str = scanner.next();
		// int num = Integer.parseInt(str);
		int com = random.nextInt(81) + 10;
		System.out.println("랜덤값 10~90을 맞추는 게임!!!");
		System.out.println("-----------------");
		while (true) {
			System.out.print("숫자를 추리하세요: ");
			int player = scanner.nextInt();
			if (player > 90 || player < 10) {
				System.out.println("잘못입력하셨습니다.");
				continue; // 이 조건이 만족되면 밑에 문장을 실행시키지 않고 바로 넘어감
			}
			if (com == player) {
				break;
			}
			if (com > player) {
				System.out.println("Up!");
			} else {
				System.out.println("Down!");
			}

		}
		System.out.println("Great!! 숫자는 :" + com);
	}
}
