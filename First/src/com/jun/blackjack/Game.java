package com.jun.blackjack;

import java.util.*;

public class Game {
	private static final int start_Phase = 2;
	public static void main(String[] args) {
		Dealer dealer = new Dealer();
		Player player = new Player();
		Deck deck = new Deck();
		Rule rule = new Rule();
		Scanner scanner = new Scanner(System.in);

		System.out.println(deck.toString());
		for(int i=0; i<start_Phase; i++) {
			Card card = deck.getCard();
			dealer.receiveCard(card);
			System.out.printf("딜러 점수: %d\n",dealer.cardSum());
			Card card2 = deck.getCard();
			player.receiveCard(card2);
			System.out.printf("플레이어 점수: %d\n",player.cardSum());
		}
		while (true) {
			System.out.println("---------BlackJack----------");
			System.out.print("Stop/Go(y/n): ");
			String str = scanner.nextLine();
		
			if (str.equals("y")) {
				/*System.out.println("플레이어 턴");
				Card card = deck.getCard();
				player.receiveCard(card);
				System.out.printf("점수: %d\n",player.cardSum());*/
				player.moreCard(deck);
				if(player.cardSum()>=21) {
					//dealer.moreCards(deck);
					rule.getWinner(player,dealer);
					break;
				}
			}else if(str.equals("n")) {
				dealer.moreCards(deck);
				rule.getWinner(player,dealer);
				break;
			}
		}
		//System.out.println(player.cardSum());
		//System.out.println(dealer.cardSum());
		
		scanner.close();
	}
}

