package com.prework.texasholdem;

public class Player {

	public Hand hand;
	public String name;

	public Player(String name) {
		this.name=name;
		this.hand = new Hand();
	}

	public void displayHoleCards() {
		this.hand.showHoleCards();
	}
	public void displayCommunityCards() {
		this.hand.showCommunityCards();
	}
}
