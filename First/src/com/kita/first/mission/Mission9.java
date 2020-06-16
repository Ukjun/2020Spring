package com.kita.first.mission;

import java.util.Arrays;

public class Mission9 {
	public static void main(String[] args) {
		int [] arr = new int[10];
		int count= 0;
		int sum = 0;
		int a =2;
		String str = ",";
		while(true) {
			if(count==10) {
				break;
			}
			arr[count] = a;
			a+=2;
			count++;
		}
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		/*for(int i=0; i<arr.length; i++) {
			if(i==arr.length-1) {
				System.out.print(arr[i]);
			}
			else {
				System.out.print(arr[i]);
				System.out.print(",");
			}
			/*if(i== arr.length-1) {
				System.out.print(arr[i]);
			}else {
				System.out.print(arr[i]+",");
			}
		}*/
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if(i!=arr.length-1) {
				System.out.print(",");
			}
		}
		Arrays.sort(arr);
		System.out.println();
		System.out.println(sum);
	}
}
