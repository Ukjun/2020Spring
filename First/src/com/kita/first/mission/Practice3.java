package com.kita.first.mission;

public class Practice3 {
	public static void main(String[] args) {
		int []arr = { 29, 33, 15, 88, 2 ,46, 92, 1, 19};
		// foreach문은 sequence가 있는 객체(배열, ArrayList등 )은 모두 사용 가능
		// 객제가 가지고 있는 값을 순차적으로 하나씩 넘겨준다(자신이 보유한 길이만큼)
		for(int val : arr) {
			System.out.print(val);
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
