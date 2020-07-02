package com.kita.first.blackjack;

import java.util.*;

public class BlackJack {
	private static final int startPhase = 2;
	private static String stopReceive = "false";
	private boolean dealerturn = true;
	private boolean playererturn = true;
	Scanner scanner = new Scanner(System.in);
	public void play() {
		
		//play();
		//System.out.println(deck.toString());
		
		//playerStartPhase(deck, player);
		//dealerStartPhase(deck, dealer);
		int dealer_point;
		/*while (true) {
			System.out.println("(플레이어 턴)카드를 뽑으시겠습니까? 그만 뽑으시겠습니까?(y/n)");
			String str = scanner.nextLine();
			if (str.equals("n")) {
				playerturn=false;
			}
			BlackJackCard card = deck.Draw();
			player.receiveCard(card);
			System.out.println("(딜러 턴)카드를 뽑으시겠습니까? 그만 뽑으시겠습니까?(y/n)");
			String str2 = scanner.nextLine();
			if (str2.equals("n")) {
				dealerturn=false;
			}
			if(playerturn=false&&dealerturn==false) {
				dealer_point =dealer.getPointSum();
				break; 
			}
			deck.Draw();
			dealer.receiveCard(card);
		}*/
		System.out.println("-----------------BlackJack---------------");
		BlackJackDeck deck = new BlackJackDeck();
		System.out.println(deck.toString());
		Scanner scanner = new Scanner(System.in);
		BlackJackDealer dealer = new BlackJackDealer();
		BlackJackPlayer player = new BlackJackPlayer();
		BlackJackRule rule = new BlackJackRule();
		List<Player> players = Arrays.asList(new BlackJackPlayer(),new BlackJackDealer()); 
		List<Player> startPhase = startPhase(deck,players);
		//List<Player> playing = playing(scanner, deck, startPhase);
		
		//Player winner = rule.getWinner(playing);
		//System.out.println("승자는 : "+winner.getName());
		scanner.close();
	}
	private List<Player> startPhase(BlackJackDeck deck, List<Player>players){
		System.out.println("처음 두장의 카드를 뽑겠습니다.");
		for(int i=0; i<startPhase; i++) {
			for(Player player : players) {
				BlackJackCard card = deck.Draw();
				player.receivedCard(card);
			}
		}
		return players;
	}
	
	public void gameStart(BlackJackDeck deck, BlackJackPlayer player) {
		while(true) {
			System.out.println("진행/종료(y/n)");
			String str = scanner.nextLine();
			if(str.equals("n")) {
				break;
			}
			BlackJackCard card = deck.Draw();
			player.receivedCard(card);
			
		}
	}
	
	
	
/*
	public static void playerStartPhase(BlackJackDeck deck, List<Player> players) {
		for (int i = 0; i < startPhase; i++) {
			for(Player player: players) {
				BlackJackCard card = deck.Draw();
				player.receivedCard(card);
			}
			//BlackJackCard card = deck.Draw();
			//player.receiveCard(card);
			//dealer.receiveCard(card);
		}
	}
	public static void playerStartPhase(BlackJackDeck deck, BlackJackPlayer player) {
		for (int i = 0; i < startPhase; i++) {
			BlackJackCard card = deck.Draw();
			player.receivedCard(card);
			//dealer.receiveCard(card);
		}
	}
	public static void dealerStartPhase(BlackJackDeck deck, BlackJackDealer dealer) {
		for (int i = 0; i < startPhase; i++) {
			BlackJackCard card = deck.Draw();
			dealer.receivedCard(card);
			//dealer.receiveCard(card);
		}
	}
	*/
	/*
	private boolean AllPlayerTurnOff(List<Player> players) {
		for(Player player: players) {
			if(player.isTurn()) {
				return false;
			}
		}
		return true;
	}
	private List<Player> startPhase(BlackJackDeck deck, List<Player>players){
		System.out.println("처음 두장의 카드를 뽑겠습니다.");
		for(int i=0; i<startPhase; i++) {
			for(Player player : players) {
				BlackJackCard card = deck.Draw();
				player.receivedCard(card);
			}
		}
		return players;
	}
	
	private List<Player> receiveAllCard(Scanner scanner, BlackJackDeck deck, List<Player> players ) {
		//boolean isreceive = true;
		while(true) {
			for(Player player : players) {
				System.out.println(player.getName()+"차례입니다.");
				if(){
					break;
				}else {
					BlackJackCard card = deck.Draw();
					player.showCard();
					player.receivedCard(card);
				}
			}
		}
	}
	
	private boolean isReceiveCard(Scanner scanner) {
		System.out.println("카드를 뽑으시겠습니까? 그만 뽑으시겠습니까?(y/n)");
		return !stopReceive.equals(scanner.nextLine());
	}
	private List<Player> playing(Scanner scanner, BlackJackDeck deck, List<Player> players){
		List<Player> cardReceivePlayer;
		while(true) {
			cardReceivePlayer = receiveAllCard(scanner, deck, players);
			if(AllPlayerTurnOff(cardReceivePlayer)) {
				break;
			}
		}
		return cardReceivePlayer;
	}*/
}
