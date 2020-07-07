package com.jun.blackjack;

import java.util.*;
public class Dealer extends Player{
	private List<Card> cards = new ArrayList<>();
	public void moreCards(Deck deck) {
		while(cardSum()<17){
			receiveCard(deck.getCard());
		}
	}
	
	//public boolean dealer_turn = true;
	/*
	public void receiveDealer(Card card) {
		if(cardSum()<=16) {
			this.cards.add(card);
		}
		//int sum = showCard();
	}*/
}

