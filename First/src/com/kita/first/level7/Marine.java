package com.kita.first.level7;

public class Marine extends Unit implements AttackUnit, Carable{	//인터페이스는 다중으로 받을수있다.
	private int damage;

	public Marine() {
		super("마린", 50);
		damage = 5;
	}

	@Override
	public void attack(Unit u) {
		
		if(u==this) {
			return;
		}
		System.out.println("따다다다다");
		u.getDamage(damage);
	}
	
}
