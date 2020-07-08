package com.kita.first.cafe;
import java.util.*;
public class Menu {
	private List<MenuItem> items  = new ArrayList<>();
	public Menu() {
		Scanner scanner = new Scanner(System.in);
		/*
		for(int i=0; i<MenuItem.menu_item.length; i++) {
			MenuItem menuitem = new MenuItem(MenuItem.menu_item[i],MenuItem.menu_price[i]);
			items.add(menuitem);
		}*/
		
		items.add(new MenuItem("아메리카노",1500));
		items.add(new MenuItem("카푸치노",2000));
		items.add(new MenuItem("카라멜 마끼야또",2500));
		items.add(new MenuItem("에스프레소",2000));
		
		/*
		while(true) {
			String str = scanner.next();
			int num = scanner.nextInt();
			if(str.equals("q")) {
				break;
			}else {
				MenuItem menuitem = new MenuItem(str,num);
				items.add(menuitem);
			}
		}
		*/
		scanner.close();
		
	}
	public void showMenu() {
		System.out.println("  Menu  \n");
		for(int i=0; i<items.size(); i++) {
			MenuItem mi = items.get(i);
			System.out.printf("%d. %s\n",i+1,mi);
		}
	}
	public MenuItem choose(int num) {
		return items.get(num);
	}
	@Override
	public String toString() {
		StringBuilder st = new StringBuilder();
		for(MenuItem item : items) {
			st.append(item.toString());
			st.append("\n");
		}
		return st.toString();
	}
}
