package com.kita.first;

public class While {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			System.out.println(i);
			
		}
		System.out.println("------------");
		int a=0;
		while(true) {
			if(a>=5) {
				break;
			}else
			{
				System.out.println(a);
				a++;
			}
		}
	}
}
