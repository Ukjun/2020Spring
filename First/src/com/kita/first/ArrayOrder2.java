package com.kita.first;

public class ArrayOrder2 {
	public static void main(String[] args) {
		int []arr = { 29, 33, 15, 88, 2 ,46, 92, 1, 19};
		int temp = 0;
		int min = 0;
		for(int i=0; i<arr.length-1;i++) { // 선택정렬 오름차순
			min = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[min]>arr[j]) {
					min = j;
				}
			}
			if(i!=min) {
				temp= arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
			
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
		
		for(int i=1; i<arr.length; i++) { // 버블정렬
			for(int j=0; j<arr.length-i; j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
