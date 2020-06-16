package com.kita.first.mission;

import java.util.*;

public class Practice2 {
	public static void main(String[] args) {
		Random ran = new Random();
		double r = Math.random(); // 나올수있는 범위는 0.1~0.9999.....
		int rVal= (int)(r*16);
		int rVal2 = (int)(Math.random()*16); //한줄로 랜덤수 출력 표현방식
		int rVal3 = (int)(Math.random()*15)+1;
		int rVal4 = (int)(Math.random()*21+30);
		int rVal5 = (int)(Math.random()*32+46);
		System.out.println(rVal4);
		int a[] = new int [10];
		for(int i=0; i<a.length; i++) {
			int num = ran.nextInt(10);
			a[i] = num;
			
			System.out.print(a[i]+" ");
		}
		
		Arrays.sort(a);
		//Arrays.parallelSort(a);
		System.out.println();
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
