package com.kita.first.level7;

public class Unit {
	private final String NAME;
	private final int MAX_HP;
	private int current_hp;

	// final에서 기본생성자를 만들고 싶을때에는 무조건 값을 지정해줘야된다.
	public Unit(String name, int max_hp) {
		this.NAME = name;
		this.MAX_HP = max_hp;
		this.current_hp = max_hp;
	}

	public int getMAX_HP() {
		return MAX_HP;
	}
	public int getCurrent_hp() {
		return current_hp;
	}

	public int setCurrent_hp(int hp) {
		return this.current_hp = hp;
	}

	public void move(int x, int y) {
		System.out.printf("x: %d, y: %d 좌표로 이동\n", x, y);

	}

	public void getDamage(int damage) {
		current_hp -= damage;
		System.out.printf("%d 만큼 데미지를 입었습니다.\n", damage);
	}

	@Override
	public String toString() {
		// return super.NAME + ", 현재 HP: " + super.getCurrent_hp();
		return String.format("%s, 현재 HP: %d", NAME, getCurrent_hp());
	}
}
