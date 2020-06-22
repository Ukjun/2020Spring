package com.kita.first.mission;

import java.util.Random;
import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		/*
		 * int []arr = { 29, 33, 15, 88, 2 ,46, 92, 1, 19}; // foreach문은 sequence가 있는
		 * 객체(배열, ArrayList등 )은 모두 사용 가능 // 객제가 가지고 있는 값을 순차적으로 하나씩 넘겨준다(자신이 보유한 길이만큼)
		 * for(int val : arr) { System.out.print(val); } for(int i=0; i<arr.length; i++)
		 * { System.out.println(arr[i]); }
		 */
		int len = 9;
		int[] arr = new int[len];
		Random random = new Random(); 			// 랜덤 객체 생성
		for (int i = 0; i < len; i++) {
			arr[i] = (int)(Math.random()*9)+1;
			//arr[i] = random.nextInt(len) + 1; 	// 1~len으로 지정한 범위까지 수 생성
			for (int j = 0; j < i; j++) { 		// 중복인지 비교할 반복문 (첫번째 들어가는 수는 어차피 중복아니니 제외한후  i가 들어간 범위까지)
												// 범위를 i말고 arr.length로 정하면 첫번째수는 무조건 같으므로 무한반복이 일어난다.
				if (arr[i] == arr[j]) {			// arr[i]와 임시로 만든 arr[j]의 항목이 같다면 중복으로 인식 (arr[0]==arr[0]은 무슨수가 들어와도 중복)
					System.out.println(arr[j]+"와 "+arr[i]+ "는 중복입니다.");
					i--; 						// 해당 i는 무효로 간주하고 1감소 (다시 시작)
					break; 						// i를 1감소시켜서 다시해야하므로 break문 실행
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
