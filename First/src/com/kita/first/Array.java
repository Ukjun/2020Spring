package com.kita.first;

import java.util.Random;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		int [] arr = new int[100];
		char[] arr2 = new char[20];
		float[] arr3 = new float[10];
		String [] arr4 = new String[200];
		int[] arr5 = {10,20,40,80};
		int[] arr6 = arr5;
		System.out.println(arr5);
		System.out.println(arr6);
		
		Scanner scanner = new Scanner(System.in);
		Random ran = new Random();
		int num = 30;
		int [] arr7 = new int[num];
		for(int i=0; i<arr7.length; i++) {
			arr7[i] = ran.nextInt(100);
			System.out.println(i+ ": "+ arr7[i]);
		}
		arr7[10] = 10;
	}
}
