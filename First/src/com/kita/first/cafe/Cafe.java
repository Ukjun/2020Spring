package com.kita.first.cafe;

public class Cafe {
	public static void main(String[] args) {
		Menu menu = new Menu();
		//MenuItem mi = new MenuItem("아메리카노",1500);
		//MenuItem mi2 = new MenuItem("카푸치노",2000);
		//System.out.println(mi);
		//System.out.println(mi2);
		//System.out.println(menu.toString());
		menu.showMenu();
		MenuItem mi = menu.choose(0);
		System.out.println(mi);
	}
}
