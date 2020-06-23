package com.kita.first.level3;

import java.util.ArrayList;

public class List2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2,11); //2번째 항목에 11을 넣겟다 >> 이미 넣어진 수는 뒤로 밀린다.
		list.remove(list.size()); // 리스트의 맨마지막 부분 삭제
		for(int i=0; i<list.size(); i++) {
			int val = list.get(i);
			System.out.print(val+ " ");
			System.out.printf("i: %d, %d / ",i++,val);
		}
	}
}
