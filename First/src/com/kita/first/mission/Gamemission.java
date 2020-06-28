package com.kita.first.mission;

import com.kita.first.Checker;

public class Gamemission {
	public static void main(String[] args) {
		int gameCnt =3;
		Baseball ball = new Baseball(gameCnt);
		//int val = ball.get(0);
		MyBall myBall = new MyBall(gameCnt);
		//int val2 = myBall.get(0);
		do {
			myBall.setNumbers();
		}while(Checker.check(gameCnt, ball, myBall));
		System.out.printf("%d번 시도를 하셨습니다!. 게임 종료!",Checker.count);
	}
}
