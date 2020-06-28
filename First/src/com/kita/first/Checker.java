package com.kita.first;

import com.kita.first.mission.Baseball;
import com.kita.first.mission.MyBall;

public class Checker {
	public static int strike;
	public static int ball;
	public static int count = 0;	//	시도한 횟수 계산

	public static boolean check(int gameCnt, Baseball b, MyBall m) {
		strike = 0;
		ball = 0;
		for (int i = 0; i < gameCnt; i++) {
			for (int j = 0; j < gameCnt; j++) {
				if (b.get(i) == m.get(j)) {
					if (i == j) {
						strike++;
						break;
					}
					ball++;
				}
			}
		}
		count++;
		if (strike == gameCnt) {
			return false;
		}
		System.out.printf("%d번째시도 : %d스트라이크 / %d볼 / %d아웃", count, strike, ball, gameCnt - (strike + ball));
		System.out.println();
		return true;
	}
}
