package com.kita.first.blackjack;

import java.util.*;

public class BlackJackCard {
	private String cardPattern;
	private String cardNum;
	private int cardpoint;

	public BlackJackCard(String cardPattern, int index) {
		this.cardPattern = cardPattern;
		this.cardNum = this.numPattern(index);
		this.cardpoint = this.CardPoint(index);
		
	}

	public String toString() {
		return "Card{ pattern=" + cardPattern + " num=" + cardNum + "}";
	}

	public String getCardPattern() {
		return cardPattern;
	}

	public void setCardPattern(String cardPattern) {
		this.cardPattern = cardPattern;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	
	public int getCardpoint() {
		return cardpoint;
	}

	public void setCardpoint(int cardpoint) {
		this.cardpoint = cardpoint;
	}

	private int CardPoint(int num) {
		if(num>=11) {
			return 10;
		}
		return num;
	}
	private String numPattern(int num) {
		if(num==1) {
			return "A";
		}else if(num==11) {
			return "J";
		}else if(num==12) {
			return "Q";
		}
		else if(num==13) {
			return "K";
		}
		return String.valueOf(num);
	}
}

