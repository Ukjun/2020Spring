package com.kita.first.level7;

public class Medic extends Unit{

	public Medic() {
		super("메딕", 70);
		// TODO Auto-generated constructor stub
	}
	public void heal(Unit u) {
		/*if(u==this) {
			System.out.println("치료할수 없습니다.");
			return;
		}*/
		if(u instanceof Carable) {
			u.setCurrent_hp(u.getMAX_HP());
		}else if(u==this)
		{
			System.out.println("치료할수 없습니다.");
		}
	}
	
}
