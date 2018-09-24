package com.prework.texasholdem;

public enum Rank {
	DEUCE(2,"2"),
	THREE(3,"3"),
	FOUR(4,"4"),
	FIVE(5,"5"),
	SIX(6,"6"),
	SEVEN(7,"7"),
	EIGHT(8,"8"),
	NINE(9,"9"),
	TEN(10,"10"),
	JACK(11,"J"),
	QUEEN(12,"Q"),
	KING(13,"K"),
	ACE(14,"A");

	private final int value;
	private final String symbol;

	private Rank(int rank, String displaySymbol) {
		this.value = rank;
		this.symbol = displaySymbol;
	}
	public int getRank() {
		return this.value;
	}
}
