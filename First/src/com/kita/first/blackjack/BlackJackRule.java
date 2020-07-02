package com.kita.first.blackjack;

import java.util.List;

public class BlackJackRule {
	public int getScore(List<BlackJackCard>list) {
		return 0;
	}
	public Player getWinner(List<Player> players) {
		Player highplayer= null;
		int highpoint =0;
		for(Player player : players) {
			int playerPointSum = getPointSum(player.openCard());
			if(playerPointSum>highpoint) {
				highplayer = player;
				highpoint = playerPointSum;
			}
		}
		return highplayer;
	}
	
	public int getPointSum(List<BlackJackCard> cards) {
		int sum =0;
		for(BlackJackCard card: cards) {
			sum+=card.getCardpoint();
		}
		return sum;
	}
}
