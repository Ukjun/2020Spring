package com.kita.first.level4;

public class Value {
	private int val;
	public Value(int val) {
		this.val = val;
	}
	
	public int getVal() {
		return val;
	}
	@Override
	public boolean equals(Object obj) {
		//값비교를 하는 로직을 써야된다. 일반적으로는 주소값을 비교한다.
/*		
 * 		if(obj instanceof Value) {
			Value value = (Value)obj;
			return val == value.val;
		}
		return false;
		final 은 메소드앞에 붙이면 오버라이딩불가 / 클래스앞에선 상속불가 / 변수앞에선 상수
		*/
		Value value = (Value)obj;
		if(value.val == val) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		//String str = String.valueOf(val);
		return String.format("%,d", val); // 3자리수마다 단위를 찍는 명령어
	}
	
}
