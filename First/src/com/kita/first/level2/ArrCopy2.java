package com.kita.first.level2;

import java.util.Arrays;

public class ArrCopy2 {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 7, 10 };
		int[] arr2 = copyArr(arr); // 주소가 다른 배열 생성
		/*
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = arr[i];	//?????????이게 맞나...
		} */
				
		System.out.println(arr == arr2);
		System.out.println("arr: " + Arrays.toString(arr)); // 배열값을 for문을 안쓰고 찍는방법
		System.out.println("arr2: " + Arrays.toString(arr2));
	}
	public static int[] copyArr(int[] n) {
		int[] a = new int[n.length];	//...???? 이렇게 생성하는게 또 맞나..
		for(int i=0; i<n.length; i++) {
			a[i] = n[i];	
		}
		return a;
	}
}
