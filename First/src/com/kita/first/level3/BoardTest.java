package com.kita.first.level3;

public class BoardTest {
	public static void main(String[] args) {
		BoardVO bv1 = new BoardVO("제목1","내용1",1);
		/*
		 * private : 같은 클래스 안에서
		 * default : private + 같은 패키지
		 * protected : default + 상속관계
		 */
		bv1.printInfo();
		BoardVO bv2 = new BoardVO();
		bv2.setTitle("제목2");
		bv2.setContent("내용2");
		bv2.setWriteId(2);
	}
}
