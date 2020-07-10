package com.kita.first.cafe;

public class Coffee {
	private String name;
	private int price;
	public Coffee(MenuItem mi) {
		this.name = mi.getName();
		this.price = mi.getPrice();
	}
	public int getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		if(price!=0) {
			return String.format("menu: %s / price: %,d원 \n", name, price);
		}else {
			return "";
		}
		
	}
}
