package com.jun.blackjack;

public class Rule {
	public void getWinner(Player player, Dealer dealer) {
		int player_sum = player.cardSum();
		int dealer_sum = dealer.cardSum();
		int blackjack = 21;
		/*
		if(player_sum==21) { //블랙잭인 경우
			System.out.printf("Player: %d, Dealer: %d Result: Player Win\n",player.cardSum(),dealer.cardSum());
		}else if(player_sum>21&&dealer_sum<21) { //플레이어가 21점이상 딜러는 21점이하인경우
			System.out.printf("Player: %d, Dealer: %d Result: Dealer Win\n",player.cardSum(),dealer.cardSum());
		}else if(player_sum<21&&dealer_sum>21) { //플레이어는 21점이하 딜러는 21점이상인경우
			System.out.printf("Player: %d, Dealer: %d Result: Player Win\n",player.cardSum(),dealer.cardSum());
		}
		if(player_sum<21&&dealer_sum<21) { // 둘다 21점이하일때
			if(dealer_sum-player_sum==0) { // 비긴 경우
				System.out.printf("Player: %d, Dealer: %d Result: Draw\n",player.cardSum(),dealer.cardSum());
			}else if(dealer_sum-player_sum>0) { //딜러숫자가 21점보다 더 가까운경우
				System.out.printf("Player: %d, Dealer: %d Result: Dealer Win\n",player.cardSum(),dealer.cardSum());
			}else // 플레이어 숫자가 21점보다 더 가까운경우
				System.out.printf("Player: %d, Dealer: %d Result: Player Win\n",player.cardSum(),dealer.cardSum());
		}
		*/
	//선생님 방식
		if(player_sum==blackjack) {
			System.out.println("BlackJack!!!!!");
		}
		
		if(player_sum==dealer_sum||(player_sum>blackjack&&dealer_sum>blackjack)) {
			System.out.printf("Player: %d, Dealer: %d Result: Draw\n",player.cardSum(),dealer.cardSum());
		}else if((player_sum<=blackjack&& player_sum>dealer_sum)||dealer_sum>blackjack){
			System.out.printf("Player: %d, Dealer: %d Result: Player Win\n",player.cardSum(),dealer.cardSum());
		}else
			System.out.printf("Player: %d, Dealer: %d Result: Dealer Win\n",player.cardSum(),dealer.cardSum());
			
		
		/*
		String str= "Dealer";
		if(player.cardSum()==blackjack) {
			System.out.printf("BlackJack!!!");
		}
		else if(player.cardSum()<blackjack) {
			if(player.cardSum()>dealer.cardSum()) {
				str = "Player";
			}
			else if(player.cardSum()==dealer.cardSum()) {
				System.out.printf("Draw  || Player: %d, Dealer: %d",player.cardSum(),dealer.cardSum());
			}
			else {
				System.out.printf("%s Win!!!!  || Player: %d, Dealer: %d",str,player.cardSum(),dealer.cardSum());
			}
		}else
		{
			System.out.printf("%s Win!!!!  || Player: %d, Dealer: %d",str,player.cardSum(),dealer.cardSum());
		}*/
	}
}
