package com.kita.first.mission;

import java.util.Scanner;

public class GreatMission2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//int num = scanner.nextInt();
		String[] str = {"사이다","콜라","환타","마운틴듀","초코우유","바나나우유"};
		int [] price = {500, 600, 700, 800, 400, 400};
		int sum =0;
		/*for(int i=1; i<=num; i++) {
			str[i] = scanner.next();
		}
		for(int i=1; i<=num; i++) {
			price[i] = scanner.nextInt();
		}
		*/
		for(int i=0; i<str.length; i++) {
			System.out.print(i+1+". "+str[i]+ " "+ price[i]+" ");
		}
		/*for(int i=0; i<num; i++) {
			System.out.print(i+" "+str[i] + price[i]+ "(원) ");
		}*/
		System.out.print(" 종료 0\n");
		while(true) {
			System.out.println("메뉴를 선택하세요");
			int click = scanner.nextInt();
			if(click==0) {
				System.out.println("종료!" + sum + "원 사용!");
				break;
			}
			else if(click<0||click>str.length){
				System.out.println("잘못입력!");
			}
			else{
				System.out.println(str[click-1]+price[click-1]+"원");
				sum +=price[click-1];
			}
		}
		scanner.close();
	}
}
