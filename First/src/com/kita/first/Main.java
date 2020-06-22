package com.kita.first;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 									// 숫자아구 시작
		Random ran = new Random();
		System.out.print("난이도 개수를 정하세요(컴퓨터는 랜덤으로 생성됩니다) : ");
		String str = scanner.next();
		System.out.println("시작!!");
		int start = Integer.parseInt(str);
		int[] com = new int[start]; 												// 컴퓨터 숫자를 저장하는 배열
		int[] player = new int[start]; 												// 사용자 숫자를 저장하는 배열
		int strike, ball;															// 스트라이크, 볼 변수
		 														
		int count = 0; 																// 입력횟수를 세는 변수
		int check_count = 1; 														// 몇회차 시도인지 체크하는 변수
		boolean[] check = new boolean[10]; 											// 중복체크 boolean 배열
		for (int i = 0; i < 10; i++) { 												// 임시로 false로 다 저장
			check[i] = false;
		}
		while (count < start) { 													// 컴퓨터 숫자입력 문단(중복체크구간
			int num = ran.nextInt(10);
			if (check[num] == false) { 												// check[num] ==false라면 밑에문장 실행
				com[count] = num; 													// 컴퓨터 숫자입력 배열에 랜덤수를 넣는다(중복없음)
				check[num] = true;										   		    // 숫자가 들어가있으므로 false > true로 변환
				count++; 															// n개만들어가야되므로 횟수를 체크한다(중복일시에는 count가 늘어나지않는다)
			}
		}
		
		while (true) { 																// 사용자가 입력 구간(맞출때까지 진행)
			strike = ball = 0; 														// 처음 스트라이크 볼은 0으로 초기화
			 																		// 회차 시도할떄마다 출력되는 문장
			System.out.printf("0~9 사이의 %d개의 정수를 입력하시오 : ", start);
			for (int i = 0; i < start; i++) { 
																					// 사용자가 숫자를 입력하는 곳
				player[i] = scanner.nextInt();
				if(player[i]<0||player[i]>9) {
					System.out.println("범위를 초과하였습니다.");
				}
				for (int j = 0; j < start; j++) {
					
					if (player[i] == com[j] ) {										// 값이 같을때 밑 조건식 작동
						
						if(i==j) {													// 인덱스 위치도 같으면 스트라이크 인덱스 위치는 다르면 볼
							
							strike++;
						}
						else {
							
							ball++;
						}
					}
				}
			}
			System.out.println(check_count + "번째");
			System.out.printf("%d스트라이크 / %d볼 / %d아웃", strike, ball, start-(strike+ball));
			System.out.println();
			check_count++; 															// 몇회차인지 출력
			if (strike == start) {													// 스트라이크가 3이되면 게임종료
				System.out.println("종료!");
				break;
			}
		}
		for (int i = 0; i < start; i++) {
			System.out.println("숫자는 : " + com[i] + " ");
			System.out.printf("%d회차에 성공하셨습니다!",check_count);
		}
		scanner.close();
	}
}
