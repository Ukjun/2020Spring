package com.kita.first.level8;

public class TryCatchTest {
	public static void main(String[] args) {
		meth();
		int num = div(10,2);
		System.out.println(num);
	}
	
	
	public static int div(int n1, int n2) {
		try {
			return n1/n2;
		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	public static void meth2() throws ClassNotFoundException  {
		Class.forName("");
	}
	public static void meth() {
		double result = 0;
		try {
			result = 10/0;
			Class.forName("dd");
		}
		catch(ClassNotFoundException e) {
			
		}
		catch(Exception e) {
			System.out.println("예외가 발생하였습니다.");
		}finally {
			System.out.println("finally");
		}
		System.out.println("result : "+result);
		System.out.println("종료");
	}
}
