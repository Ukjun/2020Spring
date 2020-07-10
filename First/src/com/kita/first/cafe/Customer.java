package com.kita.first.cafe;

import java.util.*;
public class Customer {
	//private List<MenuItem> items  = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	public MenuItem orderMenu(Menu menu) {
		while(true) {
			menu.showMenu();
			System.out.println("선택하세요(1~4) 종료(0)");
			try {
				//System.out.println(items.size());
				String str = scanner.nextLine();
				int num = Integer.parseInt(str);
				if(num==0) {
					return new MenuItem("",0);
				}
				//MenuItem mi = 
				scanner.close();
				return menu.choose(num-1);
			}
			catch(NumberFormatException e) {
				System.out.println("숫자만 입력하세요");
			}
			catch (Exception e) {
				System.out.println("다시 입력하세요");
				continue;
			}
		}
		/*
		while(true) {
			num = scanner.nextInt();
			if(num>5||num<=0) {
				System.out.println("다시 입력하세요");
			}
			else {
				break;
			}
		}*/
	}
	public void drinkCoffee(Coffee coffee) {
		//String str = coffee.getName();
		System.out.printf("%s을 마십니다.",coffee.getName());
	}
}
