package com.kita.first;

public class Printf {
	public static void main(String[] args) {
		int age = 27;
		String name = "류욱준";
		double vision = 0.6;
		char bloodType = 'B';
		
		//System.out.print("나의 이름은 " + name + "입니다. "+"나의 나이는 " + age
		//		 + "입니다." + "나의 시력은 " + vision + "입니다. "+ "나의 혈액형은 "+ bloodType+"입니다.");		
		System.out.printf("나의이름은 %s입니다. 나의 이름은 %d입니다. 나의 시력은 %.1f입니다. 나의 혈액형은 %c입니다.",name,age,vision,bloodType);
		char v1 = 'A';
		System.out.println();
		System.out.printf("%c : %d \n",v1, (int)v1);
		int v2 = 66;
		System.out.printf("%c : %d\n",(char)v2,v2);
	}
}
