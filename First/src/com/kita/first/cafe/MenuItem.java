package com.kita.first.cafe;
//import java.util.*;
public class MenuItem {
	//public static final String[] menu_item= {"아메리카노","카푸치노","카라멜 마끼야또","에스프레소"};
	//public static final List<String>menu_item2= new ArrayList<>();
	//public static int[] menu_price = {1500,2000,2500,2000};
	private String name;
	private int price;

	public MenuItem(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return String.format("menu: %s / price: %,d원 \n", name, price);
	}
}
