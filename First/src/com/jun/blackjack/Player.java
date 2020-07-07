package com.jun.blackjack;

import java.util.*;

public class Player {
	private List<Card> cards = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	//public boolean isturn = false;
	public boolean player_turn=true;

	public void setCard(Card card) {
		cards.add(card);
	}

	public void receiveCard(Card card) {
		this.cards.add(card);
		openCards();
	}

	public void openCards() {
		//int sum = 0;
		StringBuilder sb = new StringBuilder();
		sb.append("현재 카드 보유 목록: \n");
		for (Card card : cards) {
		//	sum += card.getScore();
			sb.append(card.toString());
			sb.append("\n");
			/*
			if(sum==21) {
				System.out.println("BlackJack");
				//isturn = true;
				break;
			}else if(sum>21) {
				System.out.println("Defeat");
				//isturn = true;
				break;
			}	
			if (sum >= 21) {
				System.out.println("게임 패배");
				break;
			}*/
		}
		System.out.println(sb.toString());
		
		//return sum;
	}
	public int cardSum() {
		int sum =0;
		for(Card card : cards) {
			sum+=card.getScore();
		}
		//System.out.printf("점수: %d\n",sum);
		return sum;
	}
	
	public void moreCard(Deck deck) {
		//System.out.println("---------BlackJack----------");
		//Rule rule = new Rule();
		receiveCard(deck.getCard());
		System.out.printf("점수: %d\n",cardSum());
	}
}
