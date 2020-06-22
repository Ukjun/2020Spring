package com.kita.first.level3;

public class TvTest {
	public static void main(String[] args) {
		  Tv tv1 = new Tv(); // 레퍼런스 값이라 주소값만 저장 Tv객체주소만 저장가능
		  tv1.name = "삼성Tv";
	//	  System.out.println(tv1.name);
		  System.out.println("power: "+tv1.power);
		  System.out.println("channel: "+tv1.channel);
		  tv1.changePower();
		  System.out.println("power: "+tv1.power);
		  tv1.changePower();
		  System.out.println("power: "+tv1.power);
		  tv1.channelUP();
		  tv1.channelUP();
		  tv1.channelUP();
		  System.out.println("channel: "+tv1.channel);
	}
}
