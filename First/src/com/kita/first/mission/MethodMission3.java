package com.kita.first.mission;

public class MethodMission3 {
	public static void main(String[] args) {
		int result = abs(10);
		System.out.println(result);
		result = abs(-100);
		System.out.println(result);
	}
	public static int abs(int a) {
		return a<0?-a:a; // 간단할땐 삼항식도 사용하기
	}
}
