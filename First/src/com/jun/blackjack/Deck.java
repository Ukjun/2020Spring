package com.jun.blackjack;
import java.util.*;


public class Deck {
	
	private List<Card> cards = new ArrayList<>();
	
	public Deck() {
		for(int i=0; i<Card.card_pattern.length; i++) {
			for(int j=1; j<=Card.num_count; j++) {
				Card card = new Card(Card.card_pattern[i],numDenomination(j),numPoint(j));
				cards.add(card);
			}
		}
	}
	
	public Card getCard() {
		if(cards.size()==0) {
			return null;
		}
		int ran = (int)(Math.random()*cards.size());
		Card card = cards.get(ran);
		cards.remove(ran);
		return card;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Card card : cards) {
			sb.append(card.toString());
			sb.append("\n");
		}
		return sb.toString();
	}
	/*
	public Card Draw() {
		int size = cards.size();
		if(size==0) {
			return null;
		}
		int ran = (int)(Math.random()*size);
		Card selCard = cards.get(ran);
		//System.out.println(selCard.toString());
		
		cards.remove(ran);
		return selCard;
	}*/
	public String numDenomination(int num) {
		if (num == 1) {
			return "A";
		} else if (num == 11) {
			return "J";
		} else if (num == 12) {
			return "Q";
		} else if (num == 13) {
			return "K";
		} else
		return String.valueOf(num);
	}
	
	public int numPoint(int num)
	{
		if(num>=11) {
			num =10;
		}
		return num;
	}
}
