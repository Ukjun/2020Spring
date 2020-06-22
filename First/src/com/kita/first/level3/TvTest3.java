package com.kita.first.level3;

public class TvTest3 {
	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3]; //배열객체의 주소값을 지정
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i] = new Tv();
		}
		
	}
}
 