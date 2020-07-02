package com.kita.first.blackjack;

import java.util.List;

public interface Player {
	void receivedCard(BlackJackCard card);
	void showCard();
	List<BlackJackCard> openCard();
	boolean isTurn();
	String getName();
}
