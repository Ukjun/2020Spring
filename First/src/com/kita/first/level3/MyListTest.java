package com.kita.first.level3;

import java.util.ArrayList;
import java.util.Arrays;

public class MyListTest {
	public static void main(String[] args){
		MyList list = new MyList();
		list.add(10);
		list.add(15);
		list.add(7);
		list.add(100);
		list.add(200);
		list.add(500);
		int len = list.size();
		System.out.println(len);
		int val = list.get(1);
		System.out.println(val);
		val = list.get(0);
		System.out.println(val);
		list.remove();
		int val2 = list.size();
		System.out.println(val2);
		list.remove(0);
		
	}
}

class MyList{
	ArrayList<Integer> arr = new ArrayList<>();
	private int[] arr2 = new int[0];
	public MyList() {
		
	}
	void add(int a) {
		arr.add(a);
		int []temp = new int[arr2.length+1];
		for(int i=0; i<arr2.length;i++) {
			temp[i] = arr2[i];
		}
		temp[arr2.length] =a;
		arr2 = temp;
		System.out.println(Arrays.toString(arr2));
		
		
	}
	int size() {
		return arr2.length;
	}
	int get(int a) {
		return arr2[a];
	}
	void remove() {
		int []temp = new int[arr2.length-1];
		for(int i=0; i<arr2.length-1; i++) {
			temp[i]=arr2[i];
		}
		arr2 = temp;
		System.out.println(Arrays.toString(arr2));
	}
	void remove(int a) {
		int temp[] = new int [arr2.length-1];
		for(int i=0; i<arr2.length-1; i++) {
			temp[i] = (i>=a)? arr2[i+1]:arr2[i];
		}
		arr2 = temp;
		System.out.println(Arrays.toString(arr2));
	}
}
