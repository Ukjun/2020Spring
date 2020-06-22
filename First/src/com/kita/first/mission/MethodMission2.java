package com.kita.first.mission;

public class MethodMission2 {
	public static void main(String[] args) {
		//printStar(6);
		//printStar(3);
		
		//printStar(1,4);
		//printStarSquare(4);
		//printStarTriangle(4);
		//printStarDiamond(5);
		printStarTriangleReverse(6);
	}
	public static void printStar(int num) {
		for(int i=1; i<=num; i++) {
			System.out.print("*");
		}
	}
	
	public static void printBlank(int num) { //빈칸을 출력
		for(int i=1; i<=num; i++) {
			System.out.print(" ");
		}
	}
	
	public static void printStar(int num, int num2) {
		if(num>=num2) {
			for(int i=num; i>=num2; i--) {
				printStar(i);
				System.out.println();
			}
		}else {
			for(int i=num; i<=num2; i++) {
				printStar(i);
				System.out.println();
			}
		}		
	}
	
	
	public static void printStarSquare(int num) {
		for(int i=1; i<num; i++) {
			printStar(num);
		}
	}
	
	
	public static void printStarTriangle(int num) {
		for(int i=1; i<=num; i++) {
			printStar(i);
			System.out.println();
		}
	}
	
	public static void printStarDiamond(int num) {
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
	public static void printStarTriangleReverse(int num) {
		for(int i=1; i<=num; i++) {
			printBlank(num-i);
			printStar(i);
			System.out.println();
		}
	}
}
