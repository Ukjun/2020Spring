package com.kita.first;

public class Array2 {
	public static void main(String[] args) {
		int[][]arr2 = {{10,20,30},{12,13,14}};
		int[][]a = new int[2][3];//length를 출력하면 앞에숫자인 2가나오게된다.
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.println(arr2[i][j]+",");
			}
		}System.out.println();
	}
}
