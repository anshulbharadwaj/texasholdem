package com.prework.texasholdem;

public enum Suit {
	CLUBS(1,"C"),
	DIAMONDS(2,"D"),
	HEART(3,"H"),
	SPADES(4,"S");

	private final int value;
	private final String symbol;

	private Suit(int suitValue,String displaySymbol){
		this.value=suitValue;
		this.symbol = displaySymbol;
	}

	public int getCardSuit() {
		return this.value;
	}
}
