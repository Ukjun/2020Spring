package com.kita.first.blackjack;
import java.util.*;



public class BlackJackPlayer implements Player{
	private List<BlackJackCard> cards;
	private static final String name = "사용자";
	public BlackJackPlayer() {
		cards = new ArrayList<>();
	}
	/*
	public void receiveCard(BlackJackCard card) {
		this.cards.add(card);
		showCard();
	}*/
	public void showCard() {
		StringBuilder sb = new StringBuilder();
		sb.append("플레이어의 현재 카드 보유 목록: \n");
		for(BlackJackCard card : cards) {
			sb.append(card.toString());
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
	public void showPoint() {
		
	}
	@Override
	public void receivedCard(BlackJackCard card) {
		// TODO Auto-generated method stub
		this.cards.add(card);
		showCard();
	}
	@Override
	public List<BlackJackCard> openCard() {
		// TODO Auto-generated method stub
		return cards;
	}
	@Override
	public boolean isTurn() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}

