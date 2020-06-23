package com.kita.first.level3;

import java.util.ArrayList;
import java.util.Arrays;

public class List {
	public static void main(String[] args) {
		int [] arr = {1,2,3};
		int [] temp = new int[4];
		for(int i=0; i<temp.length; i++) {
			temp[i] = arr[i];
		}
		temp[arr.length]=4;
		arr = temp;
		System.out.println(Arrays.toString(arr));
	}
}
