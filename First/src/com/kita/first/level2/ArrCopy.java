package com.kita.first.level2;

import java.util.Arrays;

public class ArrCopy {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 7, 10 };
		int[] arr2 = new int[arr.length]; // 주소가 다른 배열 생성
		
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = arr[i];	//?????????이게 맞나...
		} 
				
		System.out.println(arr == arr2);
		System.out.println("arr: " + Arrays.toString(arr)); // 배열값을 for문을 안쓰고 찍는방법
		System.out.println("arr2: " + Arrays.toString(arr2));
	}
}
