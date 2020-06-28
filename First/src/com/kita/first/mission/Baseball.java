package com.kita.first.mission;

import java.util.*;
//import java.util.Scanner;

public class Baseball {
	private int[] rArr;
	Random ran = new Random();
	public Baseball(int a){
		init(a);
	}
	public void init(int num) {
		rArr = new int[num];
		setRandom();
	}
	private void setRandom() {
		for(int i=0; i<rArr.length; i++) {
			rArr[i] = (int)(Math.random()*9+1);
			for(int j=0; j<i; j++) {
				if(rArr[i]==rArr[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(rArr));
	}
	public int get(int num) {
		return rArr[num];
	}
}
