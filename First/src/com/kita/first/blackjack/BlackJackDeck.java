package com.kita.first.blackjack;

import java.util.*;

public class BlackJackDeck {
	private static final String[] pattern = {"club","spade","heart","diamond"};
	private static final int num_count = 13;
	public List<BlackJackCard> card;
	public BlackJackDeck() {
		card = this.generateCard();
	}
	private List<BlackJackCard> generateCard(){
		List<BlackJackCard> card = new LinkedList<>();
		for(String pattern : pattern) {
			for(int i=1; i<=num_count; i++) {
				//String changenum = this.numPattern(i);
				BlackJackCard cards = new BlackJackCard(pattern,i);
				card.add(cards);
			}
		}
		return card;
	}
	public BlackJackCard getCard() {
		return null;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(BlackJackCard card : card) {
			sb.append(card.toString());
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public BlackJackCard Draw() {
		int size = card.size();
		int ran = (int)(Math.random()*size);
		BlackJackCard selCard = card.get(ran);
		card.remove(ran);
		return selCard;
	}
}
