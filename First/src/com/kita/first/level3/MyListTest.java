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
		int len = list.size();
		System.out.println(len);
		int val = list.get(1);
		System.out.println(val);
		val = list.get(0);
		System.out.println(val);
		//list.remove();
		int val2 = list.size();
		System.out.println(val2);
		//list.remove(0);
		list.add(1,5000);
		int delVal = list.remove();
		System.out.println(delVal);
		int delVal2 = list.remove(2);
		System.out.println(delVal2);
		MyArrays.print(list);
		String str = MyArrays.toString(list);
		System.out.println();
		System.out.println(str);
	}
}

class MyList{
	ArrayList<Integer> arr = new ArrayList<>();
	int[] arr2 = new int[0];
	public MyList() {
		
	}
	
	int size() {
		return arr2.length;
	}
	
	int get(int a) {
		return arr2[a];
	}
	
	int remove() { // 맨끝에있는걸 삭제
		/*int []temp = new int[arr2.length-1];
		for(int i=0; i<arr2.length-1; i++) {
			temp[i]=arr2[i];
		}
		int delete = arr2[arr2.length-1];
		arr2 = temp;
		System.out.println(Arrays.toString(arr2));*/
		return remove(arr2.length-1);
	}
	
	int remove(int a) {
		int temp[] = new int [arr2.length-1];
		int delete = arr2[a];
		for(int i=0; i<arr2.length-1; i++) {
			temp[i] = (i>=a)? arr2[i+1]:arr2[i];
		}
		arr2 = temp;
		System.out.println(Arrays.toString(arr2));
		return delete;
	}
	void add(int a) {
		//arr.add(a);
		int []temp = new int[arr2.length+1];
		for(int i=0; i<arr2.length;i++) {
			temp[i] = arr2[i];
		}
		temp[arr2.length] =a;
		arr2 = temp;
		System.out.println(Arrays.toString(arr2));
	}
	
	
	void add(int a,int num) {
		int temp[] = new int[arr2.length+1];
		
		for(int i=0; i<temp.length; i++) {
			temp[i] = (i>a)? arr2[i-1]:arr2[i];
		}
		/*
		 * for(int i=0; i<arr2.length; i++){
		 * 	temp[(i<a)?i:i+1] = arr2[i];
		 * }
		 */
		temp[a] = num;
		arr2 = temp;
		System.out.println(Arrays.toString(arr2));
	}
	/*
	 * void add(int num){
	 * 	add(arr.length,num);
	 * }
	 * */
}
class MyArrays{
	static public String toString(MyList list) {
		String str2 = "";
		for(int i=0; i<list.size(); i++) {
			if(i==list.size()-1) {
				str2 += Integer.toString(list.arr2[i]);
			}
			else {
				str2 += Integer.toString(list.arr2[i])+ ", ";
			}
			
		}
		return "["+str2+"]";
		//return String.format("[%s]",str2); 	
	}
	static void print(MyList list) {
		System.out.print("[");
		for(int i=0; i<list.size(); i++) {
			if(i==list.size()-1) {
				System.out.print(list.arr2[i]);
			}else
			{
				System.out.print(list.arr2[i]+", ");
			}
		}
		System.out.print("]");
		//System.out.println(toString(list));
	}
}