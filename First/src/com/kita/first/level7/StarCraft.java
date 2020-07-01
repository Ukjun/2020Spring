package com.kita.first.level7;

public class StarCraft {
	public static void main(String[] args) {
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Medic medic = new Medic();
		FireBat fire = new FireBat();
		//m2.attack(m2);
		//m2.attack(m2);
		//System.out.println("m1: "+m1);
		//System.out.println("m2: "+m2);
		
		fire.attack(m1);
		fire.attack(m1);
		fire.attack(m1);
		System.out.println(m1);
		m1.attack(fire);
		m1.attack(fire);
		System.out.println(fire);
		medic.heal(fire); // Carable을  implement를 받지 않았기 때문에 오류가 뜬다 >> 따라서 받는 타입을 Unit으로 변경
		medic.heal(m1);
		medic.heal(medic);
		//System.out.println(fire instanceof Carable);
		//System.out.println(m1 instanceof Carable);
		System.out.println(m1);
		System.out.println(fire);
	}
}
