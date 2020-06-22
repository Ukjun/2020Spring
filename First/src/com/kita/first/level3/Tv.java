package com.kita.first.level3;
//사용자 정의 클래스
public class Tv {
	String name; //null이 기본값
	boolean power;
	int channel;
	void changePower() {
		power = !power;
	}
	
	void channelUP() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
	
}
