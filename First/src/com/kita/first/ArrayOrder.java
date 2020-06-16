package com.kita.first;

import java.util.Arrays;

public class ArrayOrder {
	public static void main(String[] args) {
		int []arr = { 29, 33, 15, 88, 2 ,46, 92, 1, 19};
		int temp = 0;
		temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp; // 29,33만 위치 바꾸기
		
		/*for(int i=0; i<arr.length-1; i++) { // 전체를 오름차순으로 정렬 
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}*/
		/*for(int i=0; i<arr.length-1; i++) { // 전체를 내림차순으로 정렬 
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}*/
		
		for(int i=0; i<arr.length-1;i++) { // 선택정렬 오름차순
			int min = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[min]>arr[j]) {
					min = j;
				}
			}
			temp= arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		/*for(int i=0; i<arr.length-1;i++) { // 선택정렬 내림차순
			int max = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[max]<arr[j]) {
					max = j;
				}
			}
			temp= arr[max];
			arr[max] = arr[i];
			arr[i] = temp;
		}*/
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
