package com.kita.first.blackjack;


import java.util.*;

public class BlackJackDealer implements Player{
	private List<BlackJackCard> cards;
	private static final int receivepoint = 17;
	private static final String name = "딜러";
	public BlackJackDealer() {
		cards = new ArrayList<>();
	}
	public void receiveCard(BlackJackCard card) {
		if(!isReceive()) {
			this.cards.add(card);
			showCard();
		}else
		{
			System.out.println("카드합이 17이상입니다!");
		}
		
	}
	public void showCard() {
		StringBuilder sb = new StringBuilder();
		sb.append("딜러의 현재 카드 보유 목록: \n");
		for(BlackJackCard card : cards) {
			sb.append(card.toString());
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
	private boolean isReceive() {
		return getPointSum()<=receivepoint;
	}
	public int getPointSum() {
		int sum=0;
		for(BlackJackCard card : cards) {
			sum += card.getCardpoint();
		}
		return sum;
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
