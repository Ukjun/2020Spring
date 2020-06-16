package com.kita.first.mission;

import java.util.Scanner;

public class Mission3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("성별을 입력해주세요: ");
		String str = scanner.next();
		System.out.print("키을 입력해주세요: ");
		int num = scanner.nextInt();
		
		if("남자".equals(str)||"여자".equals(str)) {
			int standheight = 150;
			if("남자".equals(str)) {
				standheight = 160;
			}
			/*else {
				standheight = 150;
			}*/
			if(num==standheight) {
				System.out.print("평균입니다");
			}
			else if(num>standheight) {
				System.out.print("평균 이상입니다.");
			}
			else {
				System.out.print("평균 이하입니다.");
			}
		}else {
			System.out.println("입력오류");
		}
		scanner.close();
	}
}
