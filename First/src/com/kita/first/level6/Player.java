package com.kita.first.level6;

public abstract class Player {
	//객체화 불가 부모역할만한다(주소값만 가르킴) 
	
	
	public abstract void play(); // 상속을하면 강제 오버라이딩을 해야된다
	public void stop() {
		System.out.println("멈춤");
	}
}
abstract class CDDPPlayer extends Player{
	
}

class CDPlayer extends Player{
	@Override
	public void play() {
		System.out.println("CD를 재생");
	}
	
}
class DVDPlayer extends Player{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("DVD를 재생");
		
	}
	
}
