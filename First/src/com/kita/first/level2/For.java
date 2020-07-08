package com.kita.first.level2;

public class For {
	public static void main(String[] args) {
		int num = 6;
		for(int i=0; i<num; i++) {
			for(int j=1; j<num-i; j++){
				System.out.print(" ");
			}
			for(int k=0; k<i*2+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=num-1; i>0; i--){
			for(int j= num-i; j>0; j--){
				System.out.print(" ");
			}
			for(int k=i*2-1; k>0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


