package com.kita.first.level2;

public class Method4 {
	public static void main(String[] args) {
		sum(4,5);
		sum(5,7,9);
		sum(1,2,3,4);
	}
	public static void sum(int ...n) { // ...n으로 적으면 배열로 받는다고 인식 , 앞에 int형이있으면 첫번째수는 받고 그 이후부터 배열인자로 인식
		int sum = 0;
		for(int i=0; i<n.length; i++) {
			sum += n[i];
		}
		System.out.println("sum: "+sum);
	}
}
