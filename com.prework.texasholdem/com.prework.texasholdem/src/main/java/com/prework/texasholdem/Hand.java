package com.prework.texasholdem;

import java.util.ArrayList;
import java.util.List;

public class Hand {

	/**
     * The cards in the hand.
     */
	private final List<Card> holeCards = new ArrayList();
	private final List<Card> communityCards = new ArrayList();
	
	public void addCard(Card card) {
		this.holeCards.add(new Card(card.suit,card.rank));
	}
	
	public void addHoleCards(List<Card> cards) {
		for(Card card:cards) {
			this.holeCards.add(new Card(card.suit,card.rank));
		}
	}
	
	public void addCommunityCards(List<Card> cards) {
		for(Card card:cards) {
			this.communityCards.add(new Card(card.suit,card.rank));
		}
	}
	
	public void showCards() {
		for(Card card: this.holeCards) {
			System.out.println("holeCards added are: "+ card.suit+" - "+card.rank);
		}
	}
}
