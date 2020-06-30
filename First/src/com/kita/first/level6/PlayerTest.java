package com.kita.first.level6;

public class PlayerTest {
	public static void main(String[] args) {
		Player player = new CDPlayer(); //abstract가 들어가있기 때문에 객체화가 절대 안된다.
		//추상클래스를 상속받은 클래스는 추상클래스의 메소드를 전부 오버라이딩을 해야된다.
		player.play();
		player.stop();
		
		player = new DVDPlayer();
		player.play();
		player.stop();
	}
}
