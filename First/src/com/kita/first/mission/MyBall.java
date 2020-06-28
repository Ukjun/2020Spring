package com.kita.first.mission;

import java.util.Arrays;
import java.util.Scanner;

public class MyBall {
	private int[] myArr;
	private Scanner scanner = new Scanner(System.in);
	
	public MyBall(int num) {
		init(num);
	}
	private void init(int num) {
		myArr = new int[num];
		//System.out.println(myArr.length);
	}
	void setNumbers() {
		System.out.println("게임을 시작합니다!");
		for(int i=0; i<myArr.length; i++) {
			System.out.print("입력: ");
			String str = scanner.nextLine();
			try {
				myArr[i] = Integer.parseInt(str);
			}catch(Exception e) {
				i--;
				System.out.println("숫자를 입력하세요");
				continue;
			}
			
			System.out.printf("숫자 %d: %d",i+1,myArr[i]);
			System.out.println();
			if(myArr[i]<1||myArr[i]>9) {
				System.out.println("범위를 벗어났습니다!");
				i--;
				continue;
			}
			for(int j=0; j<i; j++) {
				if(myArr[i] == myArr[j]) {
					System.out.printf("%d번째 숫자 %d이 중복입니다 다시하세요!",i+1,myArr[i]);
					System.out.println();
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(myArr));
	}
	public int get(int num) {
		return myArr[num];
	}
}
