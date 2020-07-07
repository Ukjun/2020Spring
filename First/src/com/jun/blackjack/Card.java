package com.jun.blackjack;

public class Card {
	public static final String[] card_pattern = { "Club", "Spade", "Heart", "Diamond" };
	public static final int num_count = 13;

	private final String pattern;
	private final String denomination;
	private final int score;
	

	public Card(String pattern, String denomination, int score) {
		this.pattern = pattern;
		this.denomination = denomination;
		this.score = score;
	}

	public String getPattern() {
		return pattern;
	}

	public int getScore() {
		return score;
	}

	public String getDenomination() {
		return denomination;
	}

	public String numDenomination(int num) {
		if (num == 1) {
			return "A";
		} else if (num == 11) {
			return "J";
		} else if (num == 12) {
			return "Q";
		} else if (num == 13) {
			return "K";
		} else
		return String.valueOf(num);
	}

	@Override
	public String toString() {
		return String.format("pattern: %s, denomination: %s point: %d", pattern, denomination,score);
	}
}
