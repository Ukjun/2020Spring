package com.kita.first.level7;

public class FireBat extends Unit implements AttackUnit{

	private int damage;
	public FireBat() {
		super("파이어뱃", 60);
		damage=7;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack(Unit u) {
		// TODO Auto-generated method stub
		if(u==this) {
			return;
		}
		System.out.println("파이어");
		u.getDamage(damage);
	}

}
