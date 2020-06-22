package com.kita.first;

public class NamedLoop {
	public static void main(String[] args) {
		
		nameLoop: //임시로 이름을 정정
		for(int i=0; i<10; i++) {
			for(int j=0; j<20; j++) {
				if(i==5) {
					break nameLoop; // 정의된 이름의 식을 break;한다
				} 
				System.out.printf("%d - %d ", i, j);
			}
			System.out.println();
		}
	}
}
